package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

public class PilaPregunta {
	ArrayList<Pregunta> preguntas= new ArrayList<>();
	int nPreguntas;
	public PilaPregunta() throws IOException {
		InputStream inputStream = getClass().getResourceAsStream("/archivoPreguntas.txt"); 
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));		
		this.nPreguntas = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < nPreguntas; i++) {
			StringTokenizer tok = new StringTokenizer(bufferedReader.readLine());
			int nParrafos = Integer.parseInt(tok.nextToken());
			int dificultad = Integer.parseInt(tok.nextToken());
			int correcta = Integer.parseInt(tok.nextToken());
			String pregunta = "";
			for (int j = 0; j < nParrafos; j++) {
				pregunta += bufferedReader.readLine() + "\n";
			}
			String respuesta1 = bufferedReader.readLine();
			String respuesta2 = bufferedReader.readLine();
			String respuesta3 = bufferedReader.readLine();
			String respuesta4 = bufferedReader.readLine();
			
			Pregunta nueva = new Pregunta(dificultad, pregunta, respuesta1, respuesta2, respuesta3, respuesta4,
					correcta);
			this.preguntas.add(nueva);
		}
		bufferedReader.close();
	}

	public Pregunta getPregunta() {		
		Random r=new Random();
		int a=r.nextInt(preguntas.size());
		Pregunta pregunta = preguntas.get(a);
		return pregunta;
	}

	public int getnPreguntas() {
		return nPreguntas;
	}

}
