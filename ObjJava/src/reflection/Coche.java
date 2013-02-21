package reflection;

public class Coche {
		   
	    private String nombre;
	    private String color;
	    private int precio;
	    public String getNombre() {
	        return nombre;
	    }
	    public String getColor() {
	        return color;
	    }
	    public int getPrecio() {
	        return precio;
	    }

	    public Coche (String nombre, String color, int precio){
	        this.nombre= nombre;
	        this.color= color;
	        this.precio= precio;
	    }

}
