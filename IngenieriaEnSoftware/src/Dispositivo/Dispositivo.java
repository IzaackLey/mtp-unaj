package Dispositivo;


import java.util.List;



public class Dispositivo extends Almacen{
	public String Dato;
	public List<String> list;
	public String nombre;

	public Dispositivo(String nombre){
		this.nombre= nombre;
	}

	
	public String getNombre() {
		return nombre;
	}
	


	public String getDato() {
		return Dato;
	}


	public void setDato(String dato) {
		Dato = dato;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void SetDatoString(List<String> list, String Dato){ // los datos se guardan el un Array
		
		if (Dato.length( )< 8){
			System.out.println("lo lamento solo manejo de a 8 bits...");		
		}		
		if (list.size()==1024){
			System.out.println("Memoria llena");
		

		}else{
			
			list.add(Dato);
;

		}	
	
	
	}
	public void eliminando(int numero, List<String> lista){
		String x= lista.remove(numero);
			System.out.printf("se ha eliminado de la memoria ", x);
	}


		



	
}	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
