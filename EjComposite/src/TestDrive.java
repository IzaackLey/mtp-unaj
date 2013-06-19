import java.util.*;

public class TestDrive {
	public static void main(String args[]) {
		
		JefeComponent directorGeneral = new Jefe("Groso", "Director General", "Todas");
		JefeComponent secretaria = new Empleado("Silvia","Secreataria de Director General");
		
		JefeComponent jefeInformatica = new Jefe("Carlos", "Jefe de desarrollo", "Direccion de Informatica");
		JefeComponent desarrollador1 = new Empleado("Daniel","Desarrolador");
		JefeComponent analista = new Empleado("Fabian","Analista");
		
		jefeInformatica.add(desarrollador1);
		jefeInformatica.add(analista);
		
		directorGeneral.add(jefeInformatica);
		directorGeneral.add(secretaria);
		
		//directorGeneral.print();
		
		Iterator<JefeComponent> iterator = directorGeneral.createIterator();

		System.out.println("Busco a Carlos");
		while (iterator.hasNext()) {
			JefeComponent jefeComponent = iterator.next();
			if (jefeComponent.getNombre()=="Carlos")
				jefeComponent.print();
		}
	}
}
