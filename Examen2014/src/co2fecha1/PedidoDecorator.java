package co2fecha1;

public abstract class PedidoDecorator extends Pedido{
	Pedido pedido;
	public PedidoDecorator(Pedido pedido){
		this.pedido = pedido;
	}
	public abstract double getCosto();
	public abstract String getDescripcion();
}
