package procesos;

public class IniciarVirusScan implements Command{
	VirusScan virusScan;
	public IniciarVirusScan(VirusScan virusScan) {
		this.virusScan = virusScan;
	}

	public void execute() {
		virusScan.iniciarScan();
	}


}
