
public class Cuadrado extends Poligono{
	int longitud;
	
	public Cuadrado(){
		setLados(4);
	}
	
	public void setLogitud(int longitud){
		this.longitud = longitud;
	}
	public double getArea() {
		return longitud*longitud;
	}


}
