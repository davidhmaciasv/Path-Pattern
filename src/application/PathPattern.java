package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class PathPattern extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	private GridPane gp=new GridPane();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, -10+47*tab[0].length, -10+49*tab.length);
		BorderPane bp=new BorderPane();
		crearSeq();
		PathPatternLogic logica=new PathPatternLogic(this);
		MenHandle  mh=new MenHandle(this);
		MenuBar mb=MenuP.getMenu(scene, primaryStage, mh);
		bp.setTop(mb);
		bp.setCenter(gp);
		pane.getChildren().addAll(bp);
		crearLineas(pane);
		primaryStage.setTitle("Path Pattern");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public char[][]tab=Tablero.getBoard();
	public void crearSeq() {
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[0].length; j++) {
				crearImagen(i, j);
			}
		}
	}
	private void crearLineas(Pane pane){
		for (int i = 1; i < 10; i++) {
			Line l=new Line(i*95, 30, i*95, tab.length*49);
			pane.getChildren().add(l);
		}
		for (int i = 1; i < 6; i++) {
			Line l=new Line(0, 20+i*95, tab[0].length*47, 20+i*95);
			pane.getChildren().add(l);
		}
	}
	public void crearImagen(int i, int j) {
		Pane b = new Pane();
		b = new Pane(new ImageView(new Image(tab[i][j] + ".jpg")));
		b.setPrefSize(47, 47);
		gp.add(b, j, i);
	}
}