package testSingleton;

public class SimpleThreadClasicSingleton extends Thread{
	public SimpleThreadClasicSingleton(String str) {
        super(str);
    }
	
	
    public void run() {
		System.out.println(getName());
        try {
            sleep((int)(Math.random() * 10));
            classic.Singleton.getInstance();
        } catch (InterruptedException e) {}
    }
    
}
