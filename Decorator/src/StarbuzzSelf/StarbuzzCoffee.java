package StarbuzzSelf;

import StarbuzzSelf.Beverage.Size;

public class StarbuzzCoffee {
	public static void main(String args[]){
		Beverage beverage = new Expresso(Size.LARGE);
		System.out.println(beverage.getDescription() + " $ " + beverage.getCost());
		
		Beverage beverage2 = new HouseBlend(Size.SMALL);
		System.out.println(beverage2.getDescription() + " $ " + beverage2.getCost());
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + " $ " + beverage2.getCost());
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + " $ " + beverage2.getCost());
		
		//esto es lo que no se puede cuando uso clases concretas
//		HouseBlend houseBlend = new HouseBlend();
//		System.out.println(houseBlend.getDescription() + " $ " + houseBlend.cost());
//		houseBlend = new Mocha(houseBlend);
		
	}
}
