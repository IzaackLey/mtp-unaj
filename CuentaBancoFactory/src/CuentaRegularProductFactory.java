
public class CuentaRegularProductFactory implements CuentaProductFactory{

	public CuentaCorriente crearCuentaCorreinte() {
		return new CuentaCorrienteRegular();
	}

	public CuentaDeAhorro crearCuentaDeAhorro() {
		return new CuentaDeAhorroStandard();
	}

	public VisaCredito crearVisaCredito() {
		return new VisaInternacional();
	}

	public VisaDebito crearVisaDebito() {
		return new VisaDebitoStandard();
	}
}