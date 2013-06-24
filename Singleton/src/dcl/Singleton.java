package dcl;

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//

public class Singleton {
	private volatile static Singleton uniqueInstance;
	public static int cantidadInstancias;
 
	private Singleton() {
		cantidadInstancias++;
	}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			//ESTO NO VA ES PARA TESTEAR
			try {
				java.lang.Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
