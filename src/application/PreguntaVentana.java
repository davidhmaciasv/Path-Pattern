package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PreguntaVentana 
{
	Pregunta q;
	Jugador j;
	public PreguntaVentana(Pregunta q, Jugador j) {
		this.q = q;
		this.j = j;
	}

	public void mostrarVentana(Stage primaryStage){
		Pane pane=new Pane();
		Scene ant=primaryStage.getScene();
		Scene sc=new Scene(pane, 800, 400);
		Text t=new Text(50, 40, "Jugador "+ j.nombre+": "+q.pregunta);
		t.setFont(Font.font(20));
		Text uno=new Text(q.respuesta1);
		uno.setFont(Font.font(20));
		Text dos=new Text(q.respuesta2);
		dos.setFont(Font.font(20));
		Text tres=new Text(q.respuesta3);
		tres.setFont(Font.font(20));
		Text cuatro=new Text(q.respuesta4);
		cuatro.setFont(Font.font(20));
		ListView<Text> list = new ListView<Text>();
		ObservableList<Text> items =FXCollections.observableArrayList (
		    uno, dos, tres, cuatro);		
		list.setItems(items);
		list.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {				
				if(list.getSelectionModel().getSelectedIndex()+1==q.correcta){
					Alert a=new Alert(AlertType.INFORMATION);
					a.setTitle("PATH PATTERN");
					a.setContentText("Respuesta correcta");
					a.setHeaderText("FELICITACIONES");
					a.show();
					j.avanzar(q.dificultad);
				}else{
					Alert a=new Alert(AlertType.INFORMATION);
					a.setTitle("PATH PATTERN");
					a.setHeaderText("ERROR");
					a.setContentText("Respuesta incorrecta");
					a.show();
				}
				primaryStage.setScene(ant);
			}
		});
		list.setPrefSize(700, 300);
		list.setTranslateX(50);
		list.setTranslateY(80);
		pane.getChildren().addAll(t,list);
		primaryStage.setScene(sc);
	}
}
