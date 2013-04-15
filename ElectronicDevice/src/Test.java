
public class Test {
	public static void main(String[] args) {
		ElectronicDevice electronicDevice1 = new ElectronicDevice();
		electronicDevice1.setComunicationDevice(new ParalelComunicacionDevice());
		
		ElectronicDevice electronicDevice2 = new ElectronicDevice();
		electronicDevice1.setComunicationDevice(new ParalelComunicacionDevice());

		electronicDevice1.comunicationDevice.setConnection(electronicDevice1.comunicationDevice);
		electronicDevice1.comunicationDevice.sendData(new Byte8Bits("0101010101001"));
	}

}
