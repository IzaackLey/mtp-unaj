package colections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorComparable {

	public static void main(String[] args) {
	
		ArrayList<String> nombres=new ArrayList<String>();
		nombres.add("Carlos");
		nombres.add("Martin");
		nombres.add("Juan");
		nombres.add("Fernado");
		System.out.println("lista original:"+nombres);
		
		Collections.sort(nombres);
		System.out.println("conjunto ordenado Strings por orden afabetico: "+nombres);
		//String es comparable nativamente
		
		Persona persona1 = new Persona(1, "Mario");
		Persona persona2 = new Persona(2, "Fernando");
		//personas es comparable porque implementa comparable
		if (persona1.compareTo(persona2)<0)
			System.out.printf("%s esta antes alfabeticamente que %s \r\n", persona1.nombre, persona2.nombre);
		else
			System.out.printf("%s esta antes alfabeticamente que %s \r\n", persona2.nombre, persona1.nombre);
		
		Persona persona3 = new Persona(3, "Omar");
		Persona persona4 = new Persona(4, "Juana");
		
        ArrayList<Persona> ArrLstpersonas = new ArrayList<Persona>();
        ArrLstpersonas.add(persona1);
        ArrLstpersonas.add(persona2);
        ArrLstpersonas.add(persona3);
        ArrLstpersonas.add(persona4);
        Collections.sort(ArrLstpersonas);
        System.out.println("conjunto ordenado de personas id: "+ArrLstpersonas);
		
        Collections.sort(ArrLstpersonas, new OrdenarPersonaPorId());
        System.out.println("conjunto ordenado de personas id: "+ArrLstpersonas);
        
        System.out.println("catidad personas instanciadas "+Persona.cantidadPersonas);

        //coleccion naturalmente ordenada
		Set<Persona> setPersonas = new TreeSet<Persona>();
		setPersonas.add(persona1);
		setPersonas.add(persona2);
		setPersonas.add(persona3);
		setPersonas.add(persona4);
		
		
		System.out.println();
		StringBuffer result = new StringBuffer();
		result.append("lista ordemada alfabeticamente: ");
		Iterator<String> itr = nombres.iterator(); 
		while(itr.hasNext()) {
		    Object element = itr.next(); 
		    result.append(element + " ");
		}
		System.out.println(result);
		     
	}

}
