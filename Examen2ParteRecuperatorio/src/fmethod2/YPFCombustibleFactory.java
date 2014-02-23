package fmethod2;

public class YPFCombustibleFactory extends CombustibleFactory{
	public Combustible crearCombustible(String grado) {
		Combustible combustible=null;
		if (grado=="NaftaGrado3"){
			combustible = new NPremium();
		}else if (grado=="NaftaGrado2"){
			combustible = new SuperXXI();
		}else if (grado=="DieselGrado3"){
			combustible = new DEuro();
		}else if (grado=="DieselGrado2"){
			combustible = new DieselD500();
		}
		return combustible;
	}
}
