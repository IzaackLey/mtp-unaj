import java.sql.Date;
import java.util.Iterator;


public class Test {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		Persona persona3 = persona;
		persona.setFechaNacimiento(new Date(2000,12,1));
		
		Persona persona2;
		persona2 = new Persona("Pedro");
		
		persona2.setFechaNacimiento(new Date(20001201));
		
		System.out.println("el nombre de la persona es: "+persona.getNombre());
		if (persona==persona3){
			System.out.println("son iguales");
		}
		else{
			System.out.println("son distintas");
		}
	}

}
