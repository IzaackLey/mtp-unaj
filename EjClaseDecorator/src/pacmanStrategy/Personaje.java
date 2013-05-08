package pacmanStrategy;

public abstract class Personaje {
	SpeedBehavior speedBehavior;
	public abstract String getNombre();
	public int getAvance(){
		return speedBehavior.getAvance();
	}
	
	public void setSpeedBehavior(SpeedBehavior speedBehavior){
		this.speedBehavior = speedBehavior;
	}
	
}
