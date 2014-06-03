package clienteOperador;

public class Operador implements Usuario{
	public void accept(UsuarioVisitor visitor) {
		visitor.visit(this);
	}
}
