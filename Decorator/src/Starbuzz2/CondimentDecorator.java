package Starbuzz2;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public CondimentDecorator(Beverage beverage){
		this.beverage = beverage;
	}
	public String getDescription(){
		return beverage.getDescription();
	}
}
