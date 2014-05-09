package pacmanStrategy;

public abstract class Personaje {
	SpeedBehavior speedBehavior;
	EatBehavior eatBehavior;
	String nombre;
	
	public Personaje(SpeedBehavior speedBehavior, EatBehavior eatBehavior){
		this.speedBehavior = speedBehavior;
		this.eatBehavior = eatBehavior;
		this.nombre = "poneme un nombre";
	}
	public String getNombre(){
		String salida;
		salida = "soy un "+ this.nombre;
		if (eatBehavior.getCanEat())
			return salida + ", puedo comer";
		else
			return salida + ", me pueden comer";
	}
	
	public int getAvance(){
		return speedBehavior.getAvance();
	}
	
	public void setSpeedBehavior(SpeedBehavior speedBehavior){
		this.speedBehavior = speedBehavior;
	}
	public void setSEatBehavior(EatBehavior eatBehavior){
		this.eatBehavior = eatBehavior;
	}
}
