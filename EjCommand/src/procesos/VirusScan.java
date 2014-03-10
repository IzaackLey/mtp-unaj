package procesos;

public class VirusScan {
	String maquinaDestino;
	
	public VirusScan(String maquinaDestino){
		this.maquinaDestino = maquinaDestino;
	}
	
	public void iniciarScan(){
		System.out.println("Iniciando virus scan de la maquina: "+ maquinaDestino);
	}
}
