package clienteOperador;

public class Cliente implements Usuario{
	public void accept(UsuarioVisitor visitor) {
		visitor.visit(this);
	}
}
