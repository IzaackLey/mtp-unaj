package modificadores;

public class Main {
	public static void main(String[] args) {
		Usuario raul = new Usuario();
		Usuario juan = new Usuario();
		//se puede acceder a estos metodos o atributos desde la clase
	    System.out.println("Hay " + Usuario.usuarios + " usuarios"); 
	    //o desde una instacia cualquiera de la clase
	    System.out.println("Hay " + raul.usuarios + " usuarios");  
	    System.out.println("primer valor: " + Calculador.bascara(1, -7, 10)[0]);
	    System.out.println("primer segundo: " + Calculador.bascara(1, -7, 10)[1]);
	}
}
