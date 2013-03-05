package herencia;
import com.trolltech.qt.gui.*;
public class Test extends QWidget{
	public static void main(String[] args) {
		FiguraGeometrica fig1 = new Circulo(10); 
		System.out.println("el area del ciculo es " + fig1.getArea());
	}
}
