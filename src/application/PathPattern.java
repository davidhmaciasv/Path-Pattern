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
	private Scene scene;
	private Stage primaryStage;
	PathPatternLogic logica;
	public Stage getPrimaryStage(){
		return primaryStage;
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage=primaryStage;
		Pane pane = new Pane();
		scene = new Scene(pane, 47*tab[0].length, 49*tab.length);
		BorderPane bp=new BorderPane();
		crearSeq();
		logica=new PathPatternLogic(this);
		Handler h=new Handler(this);
		pane.setOnMouseClicked(h);
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
	
	public void volver(Stage primaryStage){
		primaryStage.setScene(scene);		
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