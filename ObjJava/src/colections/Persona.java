package colections;

public class Persona implements Comparable{
	public int idPersona;
	public String nombre;
	public java.util.Date fechaNacimiento;
    public static int cantidadPersonas=0;	
    
    public Persona(){
    	cantidadPersonas++;
    }

    public Persona(int idPersona, String nombre) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        cantidadPersonas++;
    }

	public int compareTo(Object o) {
		return this.nombre.compareTo(((Persona)o).nombre);
	}
    
    public String toString() {
        return String.format("persona{idPersona:%1s,nombre:%2s}", idPersona, nombre);
    }
}
