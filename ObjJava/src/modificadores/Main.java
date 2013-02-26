package modificadores;

public class Main {
	public static void main(String[] args) {
		Usuario raul = new Usuario();
		Usuario juan = new Usuario();
		//se puede acceder a estos metodos o atributos desde la clase
	    System.out.println("Hay " + Usuario.usuarios + " usuarios"); 
	    //o desde una instacia cualquiera de la clase
	    System.out.println("Hay " + raul.usuarios + " usuarios");  
	}
}
