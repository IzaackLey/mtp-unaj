package pacmanDecorator;

public class AddSpeed extends PersonajeDecorator{
	public AddSpeed(Personaje personaje){
		super(personaje);
	}
	public int getAvance() {
		return 1 + personaje.getAvance();
	}
}
