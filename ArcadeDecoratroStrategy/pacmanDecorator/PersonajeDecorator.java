package pacmanDecorator;

public abstract class PersonajeDecorator extends Personaje{
	protected Personaje personaje;
	public PersonajeDecorator(Personaje personaje){
		this.personaje = personaje;
	}
	
//	public int getAvance(){
//		return personaje.getAvance();
//	}
	
	public String getNombre() {
		return personaje.getNombre();
	}
}
