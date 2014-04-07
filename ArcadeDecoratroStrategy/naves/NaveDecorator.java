package naves;

public abstract class NaveDecorator extends Nave{
	Nave nave;
	public NaveDecorator(Nave nave) {
		super(nave.getNombre());
		this.nave = nave;
	}
	public abstract int getWeaponPower();
	public abstract int getArmor();
}
