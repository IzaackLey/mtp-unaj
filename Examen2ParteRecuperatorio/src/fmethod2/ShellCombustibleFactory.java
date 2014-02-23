package fmethod2;

public class ShellCombustibleFactory extends CombustibleFactory{
	public Combustible crearCombustible(String grado) {
		Combustible combustible=null;
		if (grado=="NaftaGrado3"){
			combustible = new NaftaVpowerNitro();
		}else if (grado=="NaftaGrado2"){
			combustible = new Super();
		}else if (grado=="DieselGrado3"){
			combustible = new DieselVpoweNitro();
		}else if (grado=="DieselGrado2"){
			combustible = new FormulaDiesel();
		}
		return combustible;
	}
}
