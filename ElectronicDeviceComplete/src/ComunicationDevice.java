import java.util.Iterator;
import java.util.LinkedList;


public abstract class ComunicationDevice {
	ComunicationDevice otherComunicationDevice;
	LinkedList<String> inputBuffer = new LinkedList<String>();
	final int bufferCapacity = 1024;
	
	public int setConnection(ComunicationDevice otherComunicationDevice){
		this.otherComunicationDevice = otherComunicationDevice;	
		if (otherComunicationDevice!= null)
				otherComunicationDevice.otherComunicationDevice = this;
		return 1;
	}
	
	public abstract int sendData(String word);
	
	public String reciveData(){
		String data = null;
		try {
			data = this.inputBuffer.getLast();
			this.inputBuffer.removeLast();
		} catch (Exception e) {
			
		}
		return data;
	}
	
	public void printBuffer(){
		String word;
		Iterator<String> iter = inputBuffer.iterator();
		
		while (iter.hasNext()){
			word = iter.next();
			System.out.println("posicion: "+inputBuffer.indexOf(word)+" contenido: "+ word.toString());
		}
	}
}
