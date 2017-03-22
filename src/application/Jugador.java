package application;

public class Jugador {
	public String nombre;
	public int i, j;
	PathPattern p;

	public Jugador(String nombre, PathPatternLogic p) {
		this.nombre = nombre;
		this.p = p.p;
		if(nombre.equals("1")){
			i=this.p.tab.length - 2;
			j=0;
		}
		if(nombre.equals("2")){
			i=this.p.tab.length - 2;
			j=1;
		}
		if(nombre.equals("3")){
			i=this.p.tab.length - 1;
			j=0;
		}
		if(nombre.equals("4")){
			i=this.p.tab.length - 1;
			j=1;
		}
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
				i-=2;
				avanzar(x);
			}
			cambiarEnMatriz(ii, jj);
			return;
		}else{
			while(x>0&&jj-2>=0){
				jj-=2;
				x--;
			}
			if(x>0){
				i-=2;
				avanzar(x);
			}
			cambiarEnMatriz(ii, jj);
			return;
		}
		
	}
	public void cambiarEnMatriz(int a,int b){
		if(nombre.equals("1"))
			for (int i = 0; i < p.tab.length; i++) {
				System.out.println(p.tab[i]);
			}
		p.tab[a][b]=p.tab[i][j];
		p.tab[i][j]='a';
		p.crearImagen(a, b);
		p.crearImagen(i, j);
		i=a;
		j=b;
	}
}