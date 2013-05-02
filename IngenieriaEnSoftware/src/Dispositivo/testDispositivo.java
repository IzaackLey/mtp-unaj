package Dispositivo;

import java.util.ArrayList;
import java.util.List;


public class testDispositivo {
	
	public static void main(String[] args){
		Dispositivo dis =new Dispositivo("DispositivoMAXXXX");
		List<String> list = new ArrayList<String>();
		String dat=new String("25364789");
		String data2=new String("00000000");
		dis.SetDatoString(list, dat);
		dis.SetDatoString(list, data2);
		String data3=new String("11111111");
		dis.SetDatoString(list, data3);
		Almacen x = new Almacen();
		x.guardando(list,dis);

	}

}
