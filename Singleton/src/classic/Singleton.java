package classic;
// NOTE: This is not thread safe!

public class Singleton {
	private static Singleton uniqueInstance;
	public static int cantidadInstancias=0;	//agreagado
	// other useful instance variables here
 
	private Singleton() {
		cantidadInstancias++;   //agregado
	}
 
	public static Singleton getInstance(){
		if (uniqueInstance == null) {
			//ESTO NO VA ES PARA TESTEAR
			try {
				java.lang.Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
}
