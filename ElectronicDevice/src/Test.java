
public class Test {
	public static void main(String[] args) {
		ComunicationDevice paraleldevice = new ParalelComunicacionDevice();
		ComunicationDevice paraleldevice2 = new ParalelComunicacionDevice();
		paraleldevice.setConnection(paraleldevice2);
		paraleldevice.sendData("hola");
		paraleldevice.sendData("como");
		paraleldevice.sendData("va");
		paraleldevice2.printBuffer();	
		
		ComunicationDevice usbDevice1 = new UsbComunicationDevice();
		ComunicationDevice usbDevice2 = new UsbComunicationDevice();
		usbDevice1.setConnection(usbDevice2);
		usbDevice1.sendData("hola");
		usbDevice1.sendData("como");
		usbDevice2.printBuffer();
		String data = usbDevice2.reciveData();
		while (data!=null){
			System.out.println(data);
			data = usbDevice2.reciveData();
		}
	}
}
