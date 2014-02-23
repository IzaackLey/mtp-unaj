
public class Test {

	public static void main(String[] args) {
		CuentaProductFactory factoryCuentaJoven = new CuentaJovenProductFactory(); 
		CuentaCorriente cuentaCorrienteJoven = factoryCuentaJoven.crearCuentaCorreinte();
		System.out.println(cuentaCorrienteJoven.toString());
		
		Cuenta cuenta = new Cuenta(new CuentaGoldProductFactory());
		System.out.println(cuenta.toString());
		
	}

}
