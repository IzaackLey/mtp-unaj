package absFactory;


public class  EstacionDeServicio {
	String nombre;
	NaftaGrado2 naftaGrado2;
	NaftaGrado3 naftaGrado3;
	DieselGrado2 dieselGrado2;
	DieselGrado3 dieselGrado3;
	AbstractCombustibleFactory combustibleFactory;
	
	public NaftaGrado2 getNaftaGrado2() {
		return naftaGrado2;
	}

	public NaftaGrado3 getNaftaGrado3() {
		return naftaGrado3;
	}

	public DieselGrado2 getDieselGrado2() {
		return dieselGrado2;
	}

	public DieselGrado3 getDieselGrado3() {
		return dieselGrado3;
	}

	public AbstractCombustibleFactory getCombustibleFactory() {
		return combustibleFactory;
	}

	public EstacionDeServicio(AbstractCombustibleFactory combustibleFactory, String nombre){
		this.combustibleFactory = combustibleFactory;
		this.naftaGrado2 = combustibleFactory.crearNaftaGrado2();
		this.naftaGrado3 = combustibleFactory.crearNaftaGrado3();
		this.dieselGrado2 = combustibleFactory.crearDieselGrado2();
		this.dieselGrado3 = combustibleFactory.crearDieselGrado3();
		this.nombre = nombre;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + nombre + " ----\n");
		if (naftaGrado2 != null) {
			result.append(naftaGrado2);
			result.append("\n");
		}if (naftaGrado3!= null){
			result.append(naftaGrado3);
			result.append("\n");
		}if (dieselGrado2!= null){
			result.append(dieselGrado2);
			result.append("\n");
		}if (dieselGrado3!= null){
			result.append(dieselGrado3);
			result.append("\n");
		}
		return result.toString();
	}
}
