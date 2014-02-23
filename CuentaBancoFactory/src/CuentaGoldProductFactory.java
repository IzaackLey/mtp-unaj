
public class CuentaGoldProductFactory implements CuentaProductFactory{

	public CuentaCorriente crearCuentaCorreinte() {
		return new CuentaCorrienteGold();
	}

	public CuentaDeAhorro crearCuentaDeAhorro() {
		return new CuentaDeAhorroStandard();
	}

	public VisaCredito crearVisaCredito() {
		return new VisaGold();
	}

	public VisaDebito crearVisaDebito() {
		return new VisaDebitoStandard();
	}
}