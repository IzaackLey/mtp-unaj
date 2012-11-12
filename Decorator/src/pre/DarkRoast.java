package pre;

public class DarkRoast extends Beverage{
	public DarkRoast(){
		description = "Most exelnt dark roast";
		//se puede porque esta declarado publico en la supeclase
	}
	public float cost(){
		return (float) (1.99 + super.cost());
	}
}
