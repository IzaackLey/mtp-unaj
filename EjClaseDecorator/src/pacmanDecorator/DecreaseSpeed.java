package pacmanDecorator;

public class DecreaseSpeed extends PersonajeDecorator{
	public DecreaseSpeed(Personaje personaje){
		super(personaje);
	}
	
	public int getAvance() {
		if (this.getAvance()>1)
			return -1 + getAvance();
		else
			return getAvance();
	}
}
