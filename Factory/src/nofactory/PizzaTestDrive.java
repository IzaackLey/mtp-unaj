package nofactory;

public class PizzaTestDrive {
	
	public static void main(String[] args) {
		System.out.println(new PizzaStore().orderPizza("Cheese"));
		System.out.println(new PizzaStore().orderPizza("Veggie"));
	}

}
