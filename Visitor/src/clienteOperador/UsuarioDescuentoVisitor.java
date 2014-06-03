package clienteOperador;

public class UsuarioDescuentoVisitor implements UsuarioVisitor{
	   public void visit(Cliente cliente) {
		   System.out.println("tengo descuento de 10");
	   }
	 
	   public void visit(Operador operador) {
		   System.out.println("tengo descuento de 30");
	   }
}
