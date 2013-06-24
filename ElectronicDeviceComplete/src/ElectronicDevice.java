
public class ElectronicDevice {
	public ComunicationDevice comunicationDevice;

	public ComunicationDevice getComunicationDevice() {
		return comunicationDevice;
	}

	public void setComunicationDevice(ComunicationDevice comunicationDevice) {
		this.comunicationDevice = comunicationDevice;
	}

	public void sendData(String word) {
		comunicationDevice.sendData(word);
	}
}