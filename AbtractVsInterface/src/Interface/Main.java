package Interface;

public class Main {

	public static void main(String[] arg){
		Persona p1 = new Persona();
		System.out.println("estado de la persona p1 "+p1.getEstado());
		Alarma.despertar(p1);
		System.out.println("estado de la persona p1 "+p1.getEstado());
		
		Despertable p2 = new Persona();
		System.out.println("estado de la persona p2 "+((Persona)p2).getEstado());
		Alarma.despertar(p2);
		System.out.println("estado de la persona p2 "+((Persona)p2).getEstado());
		
	}
}
