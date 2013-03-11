package interfaces;

public interface FiguraGeometrica {
	public String constante = "no se puede modificar, implicitamente final static";
	public final static String constante2 = "no se puede modificar";
	public double getArea();
	public String getNombre();
}
