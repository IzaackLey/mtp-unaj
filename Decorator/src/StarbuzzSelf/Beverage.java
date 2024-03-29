package StarbuzzSelf;

import java.util.Hashtable;

public abstract class Beverage {
	String description = "Unknown Beverage";
	public enum Size {
	    SMALL, MEDIUM, LARGE
	}
	protected Size size;
	private Hashtable<Size, Double> cost;
	
	public void SetCost(double smallCost, double mediumCost, double largeCost){
		cost = new Hashtable<Size, Double>();
		cost.put(Size.SMALL, smallCost);
		cost.put(Size.MEDIUM, mediumCost);
		cost.put(Size.LARGE, largeCost);
	}
	
	public double getCost(){
		return cost.get(size);
	}

	
	public String getDescription() {
		return description + " size: "+size;
	}
	
	public void setSize(Size size){
		this.size = size;
	}
	
	public Size getSize(){
		return this.size;
	}
	
	//public abstract double cost();
}
