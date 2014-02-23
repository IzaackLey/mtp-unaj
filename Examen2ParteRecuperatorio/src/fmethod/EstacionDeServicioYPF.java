package fmethod;

import absFactory.*;


public class EstacionDeServicioYPF extends EstacionDeServicioFactory{
	
	public EstacionDeServicioYPF() {
		super(new YPFCombustibleFactory());
	}

	public EstacionDeServicio crearEstacionDeServicio() {
		return new EstacionDeServicio(this.abstractCombustibleFactory, "YPF");
	}

}
