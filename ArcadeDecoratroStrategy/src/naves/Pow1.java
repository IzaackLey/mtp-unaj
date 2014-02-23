package naves;

public class Pow1 extends NaveDecorator{

	public Pow1(Nave nave) {
		super(nave);
	}

	public int getWeaponPower() {
		return this.nave.getWeaponPower() +1;
	}

	public int getArmor() {
		return this.nave.getArmor();
	}

}
