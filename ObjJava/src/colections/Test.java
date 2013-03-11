package colections;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
	
		ArrayList<String> nombres=new ArrayList<String>();
		nombres.add("Carlos");
		nombres.add("Martin");
		nombres.add("Juan");
		nombres.add("Fernado");
		System.out.println("lista original:"+nombres);

		StringBuffer result = new StringBuffer();
		result.append("lista ordernada: ");
		Collections.sort(nombres);
		Iterator<String> itr = nombres.iterator(); 
		while(itr.hasNext()) {
		    Object element = itr.next(); 
		    result.append(element + " ");
		}
		System.out.println(result);
		
		
		Set<Persona> personas = new TreeSet<Persona>();
        personas.add(new Persona(1, "Mario"));
        personas.add(new Persona(2, "Fernando"));
        personas.add(new Persona(3, "Omar"));
        personas.add(new Persona(4, "Juana"));

        System.out.println("conjunto ordenado de personas nombre: "+personas);

        //le cambio la ordenacion por id
        ArrayList<Persona> personas2 = new ArrayList<Persona>();
        personas2.add(new Persona(1, "Mario"));
        personas2.add(new Persona(2, "Fernando"));
        personas2.add(new Persona(3, "Omar"));
        personas2.add(new Persona(4, "Juana"));
        Collections.sort(personas2, new OrdenarPersonaPorId());
        
        System.out.println("conjunto ordenado de personas id: "+personas2);
        System.out.println("catidad personas instanciadas "+Persona.cantidadPersonas);
	}

}
