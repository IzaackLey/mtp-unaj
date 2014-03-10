package Dispositivo;

import java.util.ArrayList;

import java.util.List;

public class Almacen {
	Memoria txt=new Memoria();
	Dispositivo dis;
	List<String> list1 = new ArrayList<String>();
		public void guardando(List<String> list1, Dispositivo dis ){ //metodo que crea el archivo txt
		    for (int i=0;i<list1.size( );i++){			
				txt.writeToFile(list1.get(i), dis.getNombre());
				System.out.println(list1.get(i));
		
				
			    }	
		}
		

}

