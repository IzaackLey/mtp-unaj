package absFactory;

public class YPFCombustibleFactory implements AbstractCombustibleFactory{

	public NaftaGrado2 crearNaftaGrado2() {
		return new SuperXXI();
	}

	public NaftaGrado3 crearNaftaGrado3() {
		return new NPremium();
	}

	public DieselGrado2 crearDieselGrado2() {
		return new DieselD500();
	}

	public DieselGrado3 crearDieselGrado3() {
		return new DEuro();
	}

}
