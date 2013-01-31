package manyFactories;

public class PizzaStore {
	PizzaFactory factory;
 
	public PizzaStore(PizzaFactory factory) { 
		this.factory = factory;
	}//esto es por que es una factory concreta
 
	public Pizza orderPizza(String type) {
		Pizza pizza;
 
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
