package observerAcopladoFuerte;

public abstract class Observer {
	abstract void update(Subject obj); 
	public Subject subject;
	public Observer(Subject subject){
		this.subject = subject;
	}
}
