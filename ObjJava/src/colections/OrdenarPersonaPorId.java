package colections;
import java.util.Comparator;

public class OrdenarPersonaPorId implements Comparator<Persona>{
	public int compare(Persona o1, Persona o2) {
        return o1.idPersona - o2.idPersona;
    }
}
