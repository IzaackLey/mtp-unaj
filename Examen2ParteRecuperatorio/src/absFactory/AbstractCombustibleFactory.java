package absFactory;

public interface AbstractCombustibleFactory {
	public NaftaGrado2 crearNaftaGrado2();
	public NaftaGrado3 crearNaftaGrado3();
	public DieselGrado2 crearDieselGrado2();
	public DieselGrado3 crearDieselGrado3();
}
