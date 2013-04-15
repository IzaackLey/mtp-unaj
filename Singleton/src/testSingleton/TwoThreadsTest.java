package testSingleton;

public class TwoThreadsTest {
    public static void main (String args[]) {
        new SimpleThread("hilo1").start();
        new SimpleThread("hilo2").start();
    }
}
