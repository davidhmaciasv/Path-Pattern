package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuItem;

public class MenHandle implements EventHandler<ActionEvent> {
	PathPattern p;

	public MenHandle(PathPattern p) {
		this.p = p;
	}

	@Override
	public void handle(ActionEvent arg0) {
		MenuItem m = (MenuItem) arg0.getSource();
		switch (m.getText()) {
		case "Reinicio":
			p.tab = Tablero.getBoard();
			p.crearSeq();
			break;
		}
	}
}