
public class RubberDuck extends Duck{
	public void display() {
		System.out.println("RubberDuck");
	}
	//sobreescribe la clase fly heredada
	public void fly(){
		System.out.println("I can't fly");
	}
	//sobreescribe la clase fly heredada
	public void quack(){
		System.out.println("Quick");
	}
}
