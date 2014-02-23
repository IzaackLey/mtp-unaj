
public class Cuenta {
	VisaCredito visaCredito;
	VisaDebito visaDebito;
	CuentaCorriente cuentaCorriente;
	CuentaDeAhorro cuentaDeAhorro;
	CuentaProductFactory cuentaProductFactory;
	
	public Cuenta(CuentaProductFactory cuentaProductFactory){
		this.cuentaProductFactory = cuentaProductFactory;
		this.visaCredito = cuentaProductFactory.crearVisaCredito();
		this.visaDebito = cuentaProductFactory.crearVisaDebito();
		this.cuentaDeAhorro = cuentaProductFactory.crearCuentaDeAhorro();
		this.cuentaCorriente = cuentaProductFactory.crearCuentaCorreinte();
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		//result.append("---- " + name + " ----\n");
		if (visaDebito != null) {
			result.append(visaDebito);
			result.append("\n");
		}if (visaCredito!= null){
			result.append(visaCredito);
			result.append("\n");
		}if (cuentaDeAhorro!= null){
			result.append(cuentaDeAhorro);
			result.append("\n");
		}if (cuentaCorriente!= null){
			result.append(cuentaCorriente);
			result.append("\n");
		}
		return result.toString();
	}
}
