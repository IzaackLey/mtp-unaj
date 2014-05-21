
public class Test {

	public static void main(String[] args) {
		Mensaje mensaje = new Mensaje("mesaje de mierda");
		System.out.println(mensaje.getTexto());
		mensaje = new Algoritmo1(mensaje);
		System.out.println(mensaje.getTexto());
		mensaje = new Algoritmo2(mensaje);
		System.out.println(mensaje.getTexto());

	}

}
