package pacmanStrategy;

public class Test {
	public static void main(String[] args){
		Personaje per1 = new Pacman();
		System.out.println(per1.getNombre() + ", avanzo de a "+ per1.getAvance()+" pasos");
		per1.setSpeedBehavior(new Speed2());
		System.out.println(per1.getNombre() + ", avanzo de a "+ per1.getAvance()+" pasos");
	}
}
