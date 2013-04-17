
public abstract class Duck {
	FlyBehavior flyBehavior;  //declaro los atributos del tipo de las intefaces
	QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();        //delega el comportamiento a la clase concreta
	}
	
	public void performQuack(){
		quackBehavior.quack();    //delega el comportamiento a la clase
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys");
	}
	
	//agreagado en 2da etapa
	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior = quackBehavior;
	}
}