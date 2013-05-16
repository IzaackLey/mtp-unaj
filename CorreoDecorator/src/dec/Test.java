package dec;

public class Test {
	public static void main(String[] args) {
		Correo correo1 = new CorreoArgentino();
		System.out.println(correo1.getDescripcion() + ", " + correo1.costo() + " pesos");
		correo1 = new AdicionalDistancia(correo1);
		System.out.println(correo1.getDescripcion() + ", " + correo1.costo() + " pesos");
		correo1 = new AdicionalSeguro(correo1);
		System.out.println(correo1.getDescripcion() + ", " + correo1.costo() + " pesos");
		correo1 = new AdicionalSeguimiento(correo1);
		System.out.println(correo1.getDescripcion() + ", " + correo1.costo() + " pesos");
		correo1 = new AdicionalPeso(correo1);
		System.out.println(correo1.getDescripcion() + ", " + correo1.costo() + " pesos");
	}
}
