
public class CuentaJovenProductFactory implements CuentaProductFactory{

	public CuentaCorriente crearCuentaCorreinte() {
		return new CuentaCorrienteJoven();
	}

	public CuentaDeAhorro crearCuentaDeAhorro() {
		return new CuentaDeAhorroStandard();
	}

	public VisaCredito crearVisaCredito() {
		return new VisaNacional();
	}

	public VisaDebito crearVisaDebito() {
		return new VisaDebitoStandard();
	}
}