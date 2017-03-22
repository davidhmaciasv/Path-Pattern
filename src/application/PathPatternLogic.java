package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class PathPatternLogic {
	PathPattern p;
	PilaPregunta pila;
	Jugador uno,dos,tres,cuatro;
	public PathPatternLogic(PathPattern p) throws Exception {
		this.p = p;
		pila=new PilaPregunta();
		uno=new Jugador("1", this);
		dos=new Jugador("2", this);
		tres=new Jugador("3", this);
		cuatro=new Jugador("4", this);
	}
	
	int jugador=0;
	public void jugar(Stage primaryStage){		
		int ganador=ganador();
		if(ganador==-1){
			jugador++;
			Pregunta q=pila.getPregunta();
			PreguntaVentana pv=new PreguntaVentana(q, jugador==1?uno:jugador==2?dos:jugador==3?tres:cuatro);			
			pv.mostrarVentana(primaryStage);
			jugador%=4;
		}else{
			Alert ale=new Alert(AlertType.INFORMATION);
			ale.setTitle("JUEGO TERMINADO");
			String ganado="";
			switch (ganador) {
			case 1:
				ganado=uno.nombre;
				break;
			case 2:
				ganado=dos.nombre;
				break;
			case 3:
				ganado=tres.nombre;
				break;				
			default:
				ganado=cuatro.nombre;
				break;
			}
			ale.setContentText("El juego lo ha ganado el jugador "+ganado);			
		}
	}

	public int ganador() {
		if(p.tab[0][p.tab[0].length-2]=='1')
			return 1;
		if(p.tab[0][p.tab[0].length-1]=='2')
			return 2;
		if(p.tab[1][p.tab[1].length-2]=='3')
			return 3;
		if(p.tab[1][p.tab[1].length-1]=='4')
			return 4;
		return -1;
	}
	
}