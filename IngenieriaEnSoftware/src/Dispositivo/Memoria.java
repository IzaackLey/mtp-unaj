package Dispositivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Memoria {
 
	//los datos que se agreguen en la memoria pasaran a un archivo txt



	public void writeToFile(String datos, String nombre){
		try{
			File archivo =new File("E:\\"+nombre+".txt");
			BufferedWriter bw=new BufferedWriter(new FileWriter(archivo));
			if (archivo.exists()){
				bw.write(datos);
				bw.newLine();
				bw.close();	

			}
		
		}catch(Exception e){
			}
		}
	
	public static void readFile(String nombre){
		try{
		InputStream is= new FileInputStream("E:\\"+nombre+".txt");
		BufferedReader br= new BufferedReader(new InputStreamReader(is));
		String line;
		while ((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
		}catch (Exception e){
		}
		
	}
	
	public static void main(String []args) throws Exception{
		
	
	}


}




