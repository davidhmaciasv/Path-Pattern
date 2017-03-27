package application;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class MenuP {

	public static MenuBar getMenu(Scene scene, Stage primaryStage, MenHandle h) {
		MenuBar menu = new MenuBar();
		Menu archivo = new Menu("_Archivo");
		archivo.setMnemonicParsing(true);
		
		MenuItem reinicio = new MenuItem("Reinicio");
		reinicio.setAccelerator(new KeyCodeCombination(KeyCode.R,
				KeyCombination.SHORTCUT_DOWN));
		archivo.getItems().addAll(reinicio);
		menu.getMenus().addAll(archivo);
		reinicio.setOnAction(h);
		return menu;
	}
}