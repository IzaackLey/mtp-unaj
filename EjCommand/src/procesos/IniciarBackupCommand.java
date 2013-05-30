package procesos;

public class IniciarBackupCommand implements Command{
	Backup backup;
	public IniciarBackupCommand(Backup backup){
		this.backup = backup;
	}
	
	public void execute() {
		backup.iniciarBackup();
	}

}
