package pacmanDecorator;

public class Test {
	public static void main(String[] args) {
		Personaje per1 = new Pacman();
		System.out.println(per1.getNombre() + ", avanzo de a "+ per1.getAvance()+" pasos");
		per1 = new AddSpeed(new Pacman());
		System.out.println(per1.getNombre() + ", avanzo de a "+ per1.getAvance()+" pasos");
		Eat eat = new Eat(per1);
		System.out.println(eat.getNombre() + ", avanzo de a "+ eat.getAvance()+" pasos");
		eat.SetCanEat(false);
		System.out.println(eat.getNombre() + ", avanzo de a "+ eat.getAvance()+" pasos");
		eat.SetCanEat(true);
		System.out.println(eat.getNombre() + ", avanzo de a "+ eat.getAvance()+" pasos");
	}
}
