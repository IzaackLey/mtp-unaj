
public class Test {
	public static void main(String[] args) {
		ComunicationDevice paraleldevice = new ParalelComunicacionDevice();
		ComunicationDevice paraleldevice2 = new ParalelComunicacionDevice();
		paraleldevice.setConnection(paraleldevice2);
		
		ElectronicDevice el1 = new ElectronicDevice();
		el1.setComunicationDevice(paraleldevice);
		el1.sendData("hola");
	}
}
