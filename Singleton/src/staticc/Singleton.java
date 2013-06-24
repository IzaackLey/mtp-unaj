package staticc;

public class Singleton {
	private static Singleton uniqueInstance = new Singleton();
	public static int cantidadInstancias;
 
	private Singleton() {
		cantidadInstancias++;
	}
 
	public static Singleton getInstance() {
		//ESTO NO VA ES PARA TESTEAR
		try {
			java.lang.Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//
		return uniqueInstance;
	}
}
