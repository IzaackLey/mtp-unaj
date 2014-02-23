package naves;

public class Test {
	public static void main(String[] args) {
		Nave nave = new Nave("sarasa");
		System.out.println(nave.getNombre() + " tiene una potencia de fuego " + nave.getWeaponPower());
		nave = new Pow1(nave);
		System.out.println(nave.getNombre() + " tiene una potencia de fuego " + nave.getWeaponPower());
		nave = new Pow1(nave);
		System.out.println(nave.getNombre() + " tiene una potencia de fuego " + nave.getWeaponPower());
		nave = new Pow2(nave);
		System.out.println(nave.getNombre() + " tiene una potencia de fuego " + nave.getWeaponPower());
	}
}