package clienteOperador;

public class UsuarioPrintVisitor implements UsuarioVisitor{
	   public void visit(Cliente cliente) {
		      System.out.println("Soy un cliente");
		   }
		 
		public void visit(Operador operador) {
			System.out.println("Soy un operador");
		}
}
