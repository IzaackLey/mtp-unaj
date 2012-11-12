package StarbuzzSelf;

public class Expresso extends Beverage{
	public Expresso(Size size){
		description = "Expresso";
		setSize(size);
		SetCost(1.6, 2.0, 2.3);
	}

	public double cost() {
		return getCost();
	}
	
}
