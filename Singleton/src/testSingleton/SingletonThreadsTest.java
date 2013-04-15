package testSingleton;

public class SingletonThreadsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
        	new SimpleThreadClasicSingleton("hilo"+i).start();
        	new SimpleThreadStatSingleton("hilo"+i).start();
        	new SimpleThreadSyncSingleton("hilo"+i).start();
        }
        
        System.out.println("cantidad de instancias de sinbleton simple "+classic.Singleton.cantidadInstancias);
        System.out.println("cantidad de instancias de sinbleton estatico "+staticc.Singleton.cantidadInstancias);
        System.out.println("cantidad de instancias de sinbleton syncronizado "+dcl.Singleton.cantidadInstancias);
	}
}
