package testSingleton;

public class SimpleThreadSyncSingleton extends Thread{
	public SimpleThreadSyncSingleton(String str) {
        super(str);
    }
	
	
    public void run() {
		System.out.println(getName());
        try {
            sleep((int)(Math.random() * 10));
            dcl.Singleton.getInstance();
        } catch (InterruptedException e) {}
    }
    
}
