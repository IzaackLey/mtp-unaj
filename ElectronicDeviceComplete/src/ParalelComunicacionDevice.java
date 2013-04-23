
public class ParalelComunicacionDevice extends ComunicationDevice{

	public int setConnection(ComunicationDevice otherComunicationDevice) {
		if (otherComunicationDevice instanceof ParalelComunicacionDevice){
			super.setConnection(otherComunicationDevice);
			System.out.println("El dispositivo paralelo esta conectdo con otro dispositivo igual");
			return 1;
		}
		else{
			System.out.println("No se puedo lograr la conexion");
			return 0;
		}
	}
	
	public int sendData(String word){
		if (otherComunicationDevice == null){
			System.out.println("no hay otro dispositivo de comunicacion");
			return 0;
		}
		else {
			if (otherComunicationDevice.inputBuffer.size()<bufferCapacity)
			{
				System.out.println("enviando datos por dispostivo paralelo..... "+word.toString());
				otherComunicationDevice.inputBuffer.addFirst(word);
				return 1;
			}
			else {
				System.out.println("buffer lleno");
				return 0;
			}
		}
	}
}
