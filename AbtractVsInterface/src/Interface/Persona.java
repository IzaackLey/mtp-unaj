package Interface;

public class Persona implements Despertable{
	int estado = DESPIERTO;
	
	public Persona(){
		estado = DORMIDO;
	}
	
	public void despierta() {
		estado = DESPIERTO; 
	}

	public int getEstado(){
		return this.estado;
	}
}
