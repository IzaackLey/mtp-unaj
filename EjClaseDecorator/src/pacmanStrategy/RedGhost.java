package pacmanStrategy;

public class RedGhost extends Personaje{
	public RedGhost(){
		this.speedBehavior = new Speed1();
	}
	
	public String getNombre() {
		return "Soy un fantasma rojo";
	}

}
