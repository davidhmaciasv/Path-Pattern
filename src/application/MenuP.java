package application;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MenuP {

	public static MenuBar getMenu(Scene scene, Stage primaryStage, MenHandle h) {
		MenuBar menu = new MenuBar();
		Menu archivo = new Menu("_Archivo");
		archivo.setMnemonicParsing(true);
		
		MenuItem reinicio = new MenuItem("Reinicio");
		reinicio.setAccelerator(new KeyCodeCombination(KeyCode.R,
				KeyCombination.SHORTCUT_DOWN));
		Menu otro = new Menu("_Otros");
		otro.setMnemonicParsing(true);
		MenuItem datos = new MenuItem("Creditos");
		datos.setAccelerator(new KeyCodeCombination(KeyCode.V,
				KeyCombination.SHORTCUT_DOWN));
//		Pane p = Presentacion.pr(PrimaryStage, scene);
//		Scene sceneDat = new Scene(p, 300, 300);
//		datos.setOnAction(e -> PrimaryStage.setScene(sceneDat));
		otro.getItems().add(datos);
		archivo.getItems().addAll(reinicio);
		menu.getMenus().addAll(archivo, otro);
		reinicio.setOnAction(h);
		return menu;
	}
}