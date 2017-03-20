package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PathPattern extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	private GridPane gp=new GridPane();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 46*tab[0].length, 48*tab.length);
		BorderPane bp=new BorderPane();
		crearSeq();
		MenHandle  mh=new MenHandle(this);
		MenuBar mb=MenuP.getMenu(scene, primaryStage, mh);
		bp.setTop(mb);
		bp.setCenter(gp);
		pane.getChildren().addAll(bp);
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

	private void crearImagen(int i, int j) {
		Pane b = new Pane();
		b = new Pane(new ImageView(new Image(tab[i][j] + ".jpg")));
		b.setPrefSize(47, 47);
		gp.add(b, j, i);
	}
}