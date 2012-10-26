
public class MallardDuck extends Duck{
	private Object hola; 
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public void display() {
		System.out.println("Mallad Duck");
		
	}
}
