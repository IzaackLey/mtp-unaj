package tiposDeDatos;

public class Main {
	public static void main(String[] args) {
        String cadena = "hola"; 
        String cadena2 = new String("hola");
        String cadena2Copia = cadena2;
        
        if (cadena != cadena2){
        	System.out.println("no son distintos los valores pero si los objetos");
        }
        if (cadena2 == cadena2Copia){
        	System.out.println("son 2 referencias al mismo objeto");
        }
        if (cadena.equals(cadena2)){
        	System.out.println("esta comparando los valires");
        }
        
        int numero = 3;
        Integer numero2 = 3;        
        //Integer numero3 = new Integer(4);

        char char1 = 'a';
        Character char2 = 'a';

	}
}
