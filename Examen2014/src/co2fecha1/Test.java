package co2fecha1;

public class Test {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(550,"pedido");
		System.out.println(pedido.getDescripcion()+" costo "+pedido.getCosto());
		pedido = new Descuento10(pedido);
		System.out.println(pedido.getDescripcion()+" costo "+pedido.getCosto());
		pedido = new Envio(pedido);
		System.out.println(pedido.getDescripcion()+" costo "+pedido.getCosto());
	}

}
