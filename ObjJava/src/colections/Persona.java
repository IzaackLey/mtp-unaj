package colections;

public class Persona implements Comparable{
	private int idPersona;
    private String nombre;
    private java.util.Date fechaNacimiento;
    public static int cantidadPersonas=0;	
    
    public Persona(){
    	cantidadPersonas++;
    }

    public Persona(int idPersona, String nombre) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        cantidadPersonas++;
    }

    public int getIdPersona() {	
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public java.util.Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(java.util.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String toString() {
        return String.format("persona{idPersona:%1s,nombre:%2s}", idPersona, nombre);
    }

	public int compareTo(Object o) {
		return this.nombre.compareTo(((Persona)o).nombre);
	}

}
