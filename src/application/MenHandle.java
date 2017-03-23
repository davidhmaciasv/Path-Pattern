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
			p.tab = new char[][]{ "aaaaaaaaaaaaaaaaaaaa".toCharArray(),
					"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
					"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
					"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
					"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
					"aaaaaaaaaaaaaaaaaaaa".toCharArray(),	
					"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
					"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
					"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
					"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
					"12aaaaaaaaaaaaaaaaaa".toCharArray(),
					"34aaaaaaaaaaaaaaaaaa".toCharArray()
					};
			p.logica.uno=new Jugador("1", p.logica);
			p.logica.dos=new Jugador("2", p.logica);
			p.logica.tres=new Jugador("3", p.logica);
			p.logica.cuatro=new Jugador("4", p.logica);
			p.crearSeq();
			break;
		}
	}
}