package pre;

public abstract class Beverage {
	public String description;
	private boolean milk;
	private boolean soy;
	private boolean mocha;
	private boolean whip;
	
	private double milkCost  = 1.1;
	private double soyCost = 0.5;
	private double mochaCost = 1.3;
	private double whipCost = 0.9;
	
	
	public float cost(){
		float condimentCost = (float) 0.0;
		if (hasMilk()){
			condimentCost += milkCost;
		}
		if (hasMocha()){
			condimentCost += mochaCost;
		}
		if (hasSoy()){
			condimentCost += soyCost;
		}
		if (hasWhip()){
			condimentCost += whipCost;
		}
		return condimentCost;
	}
		
	public boolean hasMilk(){
		return milk;
	}
	public void setMilk(boolean has){
		this.milk = has;
	}
	
	public boolean hasSoy(){
		return soy;
	}
	public void setSoy(boolean has){
		this.soy = has;
	}
	
	
	public boolean hasMocha(){
		return mocha;
	}
	public void setMocha(boolean has){
		this.mocha = has;
	}
	
	public boolean hasWhip(){
		return whip;
	}
	public void setWhip(boolean has){
		this.whip = has;
	}

	public String getDescription() {
		return description;
	}
	
	
}
