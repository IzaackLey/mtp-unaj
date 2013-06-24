package testSingleton;

public class SimpleThreadStatSingleton extends Thread{
	public SimpleThreadStatSingleton(String str) {
        super(str);
    }
	
	
    public void run() {
		System.out.println(getName());
        try {
            sleep((int)(Math.random() * 10));
            staticc.Singleton.getInstance();
        } catch (InterruptedException e) {}
    }
    
}
