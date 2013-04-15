import java.util.LinkedList;


public abstract class ComunicationDevice {
	ComunicationDevice otherComunicationDevice;
	LinkedList<Byte8Bits> inputBuffer = new LinkedList<Byte8Bits>();
	
	public void setConnection(ComunicationDevice otherComunicationDevice){
		this.otherComunicationDevice = otherComunicationDevice;	
		if (otherComunicationDevice.otherComunicationDevice != this)
			otherComunicationDevice.setConnection(this);
	}
	
	public int sendData(Byte8Bits bytee){
		if (otherComunicationDevice == null){
			System.out.println("no hay otro dispositivo de comunicacion");
			return 0;
		}
		else
		{
			System.out.println("enviando datos "+bytee.toString());
			otherComunicationDevice.inputBuffer.addFirst(bytee);
			return 1;
		}
	}
	
	public Byte8Bits reciveData(){
		Byte8Bits data = this.inputBuffer.getLast();
		System.out.println("recibiendo datos " + data.toString());
		this.inputBuffer.removeLast();
		return data;
	}
}
