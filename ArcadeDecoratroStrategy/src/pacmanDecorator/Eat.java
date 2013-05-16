package pacmanDecorator;

public class Eat extends PersonajeDecorator{
	public boolean canEat;
	public Eat(Personaje personaje){
		super(personaje);
		canEat = true;
	}
	
	public boolean getCanEat(){
		return canEat;
	}
	
	public void SetCanEat(boolean canEat){
		this.canEat = canEat;
	}
	
	public String getNombre(){
		if (canEat)
			return personaje.getNombre() + ", puedo comer";
		else
			return personaje.getNombre() + ", me pueden comer";
	}

}
