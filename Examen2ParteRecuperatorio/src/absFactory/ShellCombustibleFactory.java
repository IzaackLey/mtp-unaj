package absFactory;

public class ShellCombustibleFactory implements AbstractCombustibleFactory{

	public NaftaGrado2 crearNaftaGrado2() {
		return new Super();
	}

	public NaftaGrado3 crearNaftaGrado3() {
		return new NaftaVpowerNitro();
	}

	public DieselGrado2 crearDieselGrado2() {
		return new FormulaDiesel();
	}

	public DieselGrado3 crearDieselGrado3() {
		return new DieselVpoweNitro();
	}

}
