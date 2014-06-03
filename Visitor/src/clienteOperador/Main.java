package clienteOperador;

public class Main {
	public static void main(String[] args) {
		 
	      Usuario c = new Cliente();
	      //Supongamos que nuestro programa recibe un Usuario x.
	      //Para cualquier usuario ya no necesitamos condicionales.
	      UsuarioVisitor vPrint = new UsuarioPrintVisitor();
	      //UsuarioDescuentoVisitor vDes = new UsuarioDescuentoVisitor();
	      UsuarioVisitor vDes = new UsuarioDescuentoVisitor();
	      c.accept(vPrint);
	      c.accept(vDes);
	}
}
