package pacmanDecorator;

public class RedGhost extends Personaje {

	public RedGhost(){
		this.nombre = "Fantasma Rojo";
	}
	
	public int getAvance() {
		return 2;
	}
}
