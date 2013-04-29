package pre;

public class DarkRoast extends Beverage{
	public DarkRoast(){
		description = "Most exelnt dark roast";
	}
	public float cost(){
		return (float) (1.99 + super.cost());
	}
}
