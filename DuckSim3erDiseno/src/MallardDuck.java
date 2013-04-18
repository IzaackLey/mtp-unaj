
public class MallardDuck extends Duck implements Quackable, Flyable{
	public void display() {
		System.out.println("I'm a MallardDuck duck");		
	}
	public void quack(){
		System.out.println("Quack");
	}
	public void fly() {
		System.out.println("I'm flying");
	}
}
