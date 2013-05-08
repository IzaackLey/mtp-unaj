package pacmanStrategy;

public class Pacman extends Personaje{
	public Pacman(){
		this.speedBehavior = new Speed1();
	}
	
	public String getNombre() {
		return "soy un pacman";
	}
}
