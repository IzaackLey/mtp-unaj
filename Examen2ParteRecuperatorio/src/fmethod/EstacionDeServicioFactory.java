package fmethod;

import absFactory.*;

public abstract class EstacionDeServicioFactory{
	AbstractCombustibleFactory abstractCombustibleFactory;
	public EstacionDeServicioFactory(AbstractCombustibleFactory abstractCombustibleFactory){
		this.abstractCombustibleFactory = abstractCombustibleFactory;
	}
	public abstract EstacionDeServicio crearEstacionDeServicio();
}
