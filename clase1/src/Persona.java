import java.util.Date;

public class Persona {
	public String nombre;
	public Date fechaNacimiento;
	
	public Persona(String nombre){
		this.nombre = nombre;
	}

	public Persona(){
		this.nombre = "Pedro";
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}
