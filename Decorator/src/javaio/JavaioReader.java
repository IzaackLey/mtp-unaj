package javaio;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JavaioReader {
	public static void main(String[] args) {
		try{
			FileInputStream fstream = new FileInputStream("archivo.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null){
				System.out.println (strLine);
			}
			in.close();
		  }
		catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	}
}
