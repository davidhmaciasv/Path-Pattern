package application;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Handler implements EventHandler<MouseEvent> {
	PathPattern path;
	public Handler(PathPattern path) {
		this.path=path;
	}
	
	@Override
	public void handle(MouseEvent event) {
		System.out.println("algo");
		if(event.getClickCount()==1){
			path.logica.jugar(path.getPrimaryStage());
		}
	}
}
