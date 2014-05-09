package co2fecha1;

public class Descuento15 extends PedidoDecorator{

	public Descuento15(Pedido pedido) {
		super(pedido);
	}

	public double getCosto() {
		return pedido.getCosto()-pedido.getCosto()*15/100;
	}

	public String getDescripcion() {
		return pedido.getDescripcion()+ " - cupon de descuento 15%";
	}

}
