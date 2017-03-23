package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PilaPregunta {
	Queue<Pregunta> preguntas= new LinkedList<Pregunta>();
	int nPreguntas;
	public PilaPregunta() throws IOException {
		BufferedReader in=new BufferedReader(new FileReader(new File("src/archivoPreguntas.txt").getAbsolutePath()));
		this.nPreguntas = Integer.parseInt(in.readLine());
		for (int i = 0; i < nPreguntas; i++) {
			StringTokenizer tok = new StringTokenizer(in.readLine());
			int nParrafos = Integer.parseInt(tok.nextToken());
			int dificultad = Integer.parseInt(tok.nextToken());
			int correcta = Integer.parseInt(tok.nextToken());
			String pregunta = "";
			for (int j = 0; j < nParrafos; j++) {
				pregunta += in.readLine() + "\n";
			}
			String respuesta1 = in.readLine();
			String respuesta2 = in.readLine();
			String respuesta3 = in.readLine();
			String respuesta4 = in.readLine();
			
			Pregunta nueva = new Pregunta(dificultad, pregunta, respuesta1, respuesta2, respuesta3, respuesta4,
					correcta);
			this.preguntas.offer(nueva);
		}
	}

	public Pregunta getPregunta() {		
		Pregunta pregunta = this.preguntas.remove();
		this.preguntas.offer(pregunta);
		return pregunta;
	}

	public Queue<Pregunta> getPreguntas() {
		return preguntas;
	}

	public int getnPreguntas() {
		return nPreguntas;
	}

}
