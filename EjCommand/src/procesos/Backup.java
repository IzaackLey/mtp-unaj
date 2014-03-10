package procesos;

public class Backup {
	String servidorOrgien;
	String carpetaOrigen;
	String servidorDestino;
	String carpetaDestino;

	
	public Backup(String servidorOrgien, String carpetaOrigen, String servidorDestino, String carpetaDestino)
	{
		this.servidorOrgien = servidorDestino;
		this.carpetaOrigen = carpetaOrigen;
		this.servidorDestino = servidorDestino;
		this.carpetaDestino = carpetaDestino;
	}
	
	public void iniciarBackup(){
		System.out.println("Iniciando backup del servidor: "+ servidorOrgien + " carptera: " + carpetaDestino);
	}

}
