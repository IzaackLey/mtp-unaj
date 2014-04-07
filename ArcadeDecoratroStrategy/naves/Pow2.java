package naves;

public class Pow2 extends NaveDecorator{

	public Pow2(Nave nave) {
		super(nave);
	}

	public int getWeaponPower() {
		return 0;
	}

	public int getArmor() {
		return 0;
	}
}
