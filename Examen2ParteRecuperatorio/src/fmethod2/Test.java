package fmethod2;

public class Test {
	public static void main(String[] args) {
		CombustibleFactory ypf = new YPFCombustibleFactory();
		System.out.println(ypf.crearCombustible("NaftaGrado3"));
		System.out.println(ypf.crearCombustible("NaftaGrado2"));
		
		CombustibleFactory shell = new YPFCombustibleFactory();
		System.out.println(shell.crearCombustible("NaftaGrado3"));
		System.out.println(shell.crearCombustible("NaftaGrado2"));
	}
}
