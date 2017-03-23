package application;

public class Jugador {
	public String nombre;
	public int i, j;
	PathPattern p;

	public Jugador(String nombre, PathPatternLogic p) {
		this.nombre = nombre;
		this.p = p.p;
		if (nombre.equals("1")) {
			i = this.p.tab.length - 2;
			j = 0;
		}
		if (nombre.equals("2")) {
			i = this.p.tab.length - 2;
			j = 1;
		}
		if (nombre.equals("3")) {
			i = this.p.tab.length - 1;
			j = 0;
		}
		if (nombre.equals("4")) {
			i = this.p.tab.length - 1;
			j = 1;
		}
	}

	public void avanzar(int x) {
		int ii = i, jj = j;
		if (i > 9 || i == 6 || i == 7 || i == 2 || i == 3) {
			while (x > 0 && jj + 2 < p.tab[0].length) {
				x--;
				jj += 2;
			}
			if (x > 0) {
				x--;
				ii -= 2;
				cambiarEnMatriz(ii, jj);
				if (x > 0)
					this.avanzar(x);
				return;
			}
		} else {
			while (x > 0 && jj - 2 >= 0) {
				x--;
				jj -= 2;
			}
			if (x > 0) {
				if (i != 0 && i != 1) {
					x--;
					ii -= 2;
					cambiarEnMatriz(ii, jj);
					if (x > 0)
						this.avanzar(x);
					return;
				}
			}
		}
		cambiarEnMatriz(ii, jj);
	}

	public void cambiarEnMatriz(int a, int b) {
		p.tab[a][b] = p.tab[i][j];
		p.tab[i][j] = 'a';
		p.crearImagen(a, b);
		p.crearImagen(i, j);
		i = a;
		j = b;
	}
}