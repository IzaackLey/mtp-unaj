package clienteOperador;

public interface UsuarioVisitor {
	void visit(Cliente cliente);
	void visit(Operador operador);
}
