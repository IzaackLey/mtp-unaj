package co2fecha1;

public class Pedido {
	public double costo;
	public String descripcion;
	public Pedido(double costo, String descripcion){
		this.costo = costo;
		this.descripcion = descripcion;
	}
	public Pedido(){}
	
	public double getCosto() {
		return costo;
	}
	public String getDescripcion() {
		return descripcion;
	}
}
