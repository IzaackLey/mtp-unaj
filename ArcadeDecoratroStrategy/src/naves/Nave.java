package naves;

public class Nave {
	public String nombre;
	public int weaponPower;
	public int armor;
	
	public Nave(String nombre){
		this.weaponPower = 1;
		this.armor = 1;
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getWeaponPower(){
		return this.weaponPower;
	}
	
	public int getArmor(){
		return this.armor;
	}
	
	
}
