package application;

public class Pregunta {
	int dificultad;
	String pregunta;
	String respuesta1;
	String respuesta2;
	String respuesta3;
	String respuesta4;
	int correcta;

	public Pregunta(int dificultad, String pregunta, String respuesta1,
			String respuesta2, String respuesta3,
			String respuesta4, int correcta) {
		this.dificultad=dificultad;
		this.pregunta=pregunta;
		this.respuesta1=respuesta1;
		this.respuesta2=respuesta2;
		this.respuesta3=respuesta3;
		this.respuesta4=respuesta4;
		this.correcta=correcta;
	}

	public int getDificultad() {
		return dificultad;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuesta1() {
		return respuesta1;
	}

	public void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}

	public String getRespuesta2() {
		return respuesta2;
	}

	public void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}

	public String getRespuesta3() {
		return respuesta3;
	}

	public void setRespuesta3(String respuesta3) {
		this.respuesta3 = respuesta3;
	}

	public String getRespuesta4() {
		return respuesta4;
	}

	public void setRespuesta4(String respuesta4) {
		this.respuesta4 = respuesta4;
	}

	public int getCorrecta() {
		return correcta;
	}

	public void setCorrecta(int correcta) {
		this.correcta = correcta;
	}
}
