package simplePizzaFactory;

public class PizzaStore {
	SimplePizzaFactory factory;
 
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
	//	PizzaStore se le pasa una factory en la creación y ademas se deja una referencia para poder usarla
 
	public Pizza orderPizza(String type) {
		Pizza pizza;
 
		pizza = factory.createPizza(type);
	 	//usa la factory simplemente pasando el tipo, ahora no hay mas instanciaciones concretas aca
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
