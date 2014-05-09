package co2fecha1;

public class Envio extends PedidoDecorator{

	public Envio(Pedido pedido) {
		super(pedido);
	}

	public double getCosto() {
		return pedido.getCosto()+50;
	}

	public String getDescripcion() {
		return pedido.getDescripcion()+ " + envio %50";
	}

}
