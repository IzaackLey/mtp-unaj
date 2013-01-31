package nofactory;

public class PizzaStore {
	
	public Pizza orderPizza(String type){
		Pizza pizza=null;
		if (type.equals("Cheese")){
			pizza=new CheesePizza();
		}
		if (type.equals("Veggie")){
			pizza=new VeggiePizza();
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
