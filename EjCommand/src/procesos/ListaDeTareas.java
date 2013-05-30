package procesos;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaDeTareas {
	ArrayList<Command> iniciarTareas;
	
	public ListaDeTareas(){
		iniciarTareas = new ArrayList<Command>();
	}
	
	public void setCommand(Command tarea) {
		iniciarTareas.add(tarea);
	}
	
	public void removeCommand(Command tarea) {
		iniciarTareas.remove(tarea);
	}
	
	public void ejecutarListaDeTareas() {
		Iterator<Command> iter= iniciarTareas.iterator();
		while (iter.hasNext()){
			iter.next().execute();
		}
	}
}
