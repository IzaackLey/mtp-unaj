package co2fecha1;

public class Descuento10 extends PedidoDecorator{

	public Descuento10(Pedido pedido) {
		super(pedido);
	}

	public double getCosto() {
		return pedido.getCosto()-pedido.getCosto()*10/100;
	}

	public String getDescripcion() {
		return pedido.getDescripcion()+ " - cupon de descuento 10%";
	}

}
