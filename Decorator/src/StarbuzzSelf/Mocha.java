package StarbuzzSelf;
public class Mocha extends CondimentDecorator{
	public Mocha(Beverage beverage){
		this.beverage = beverage;
		setSize(beverage.size);
		SetCost(0.1, 0.5, 0.8);
	}

	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	public double getCost() {
		return super.getCost() + beverage.getCost();
	}

}