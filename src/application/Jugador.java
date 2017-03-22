package application;

public class Jugador {
	public String nombre;
	public int i, j;
	PathPattern p;

	public Jugador(String nombre, PathPatternLogic p) {
		this.nombre = nombre;
		this.p = p.p;
		i = this.p.tab.length - 1;
		j = 0;
	}

	public void avanzar(int x) {
		int dir = i % 4;
		int ii = i, jj = j;
		if(dir>=2){
			while(x>0&&jj+2<p.tab[0].length){
				jj+=2;
				x--;
			}
			if(x>0){
				ii-=2;
				avanzar(x);
				return;
			}
		}else{
			while(x>0&&jj-2>=0){
				jj-=2;
				x--;
			}
			if(x>0){
				ii-=2;
				avanzar(x);
				return;
			}
		}
		cambiarEnMatriz(ii, jj);
	}
	public void cambiarEnMatriz(int a,int b){
		p.tab[a][b]=p.tab[i][j];
		p.tab[i][j]='a';
		p.crearImagen(a, b);
		p.crearImagen(i, j);
		i=a;
		j=b;
	}
}