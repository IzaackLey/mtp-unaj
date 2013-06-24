public class UsbComunicationDevice extends ComunicationDevice{
	public int setConnection(ComunicationDevice otherComunicationDevice) {
		if (otherComunicationDevice instanceof UsbComunicationDevice){
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
				System.out.println("enviando datos por dispostivo usb..... " );
				otherComunicationDevice.inputBuffer.addFirst("");
				for (int i = 0; i<word.length(); i++){
					char bit = word.charAt(i);
					System.out.println("enviando bit: "+bit);
					String tmpword = otherComunicationDevice.inputBuffer.getFirst();
					tmpword = tmpword.concat(String.valueOf(bit));
					otherComunicationDevice.inputBuffer.set(0, tmpword);
				}
				
				return 1;
			}
			else {
				System.out.println("buffer lleno");
				return 0;
			}
		}
	}
}
