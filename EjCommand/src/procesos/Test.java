package procesos;

public class Test {

	public static void main(String[] args) {

		ListaDeTareas listaDeTareas = new ListaDeTareas();
		
		VirusScan virusScanServidor01 = new VirusScan("servidor01");
		VirusScan virusScanServidor02 = new VirusScan("servidor02");
		Backup backupServidor01 = new Backup("servidor01", "c:\\", "backupServer", "c:\\servidor01");
		Backup backupServidor02 = new Backup("servidor02", "c:\\", "backupServer", "c:\\servidor02");
 
		IniciarVirusScan iniciarVirusScanServidor01 = new IniciarVirusScan(virusScanServidor01);
		IniciarVirusScan iniciarVirusScanServidor02 = new IniciarVirusScan(virusScanServidor02);

		IniciarBackupCommand iniciarBackupServidor01Command = new IniciarBackupCommand(backupServidor01);
		IniciarBackupCommand iniciarBackupServidor02Command = new IniciarBackupCommand(backupServidor02);

		listaDeTareas.setCommand(iniciarVirusScanServidor01);
		listaDeTareas.setCommand(iniciarVirusScanServidor02);
		listaDeTareas.setCommand(iniciarBackupServidor01Command);
		listaDeTareas.setCommand(iniciarBackupServidor02Command);
		
		listaDeTareas.ejecutarListaDeTareas();	
	}
}
