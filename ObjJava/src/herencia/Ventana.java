package herencia;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.core.*;

public class Ventana extends QWidget{
	QTextEdit textEdit;
	QComboBox cmb;
	FiguraGeometrica figuraGeometrica;
	
	public static void main(String[] args) {
	    QApplication.initialize(args);
	    Ventana widget = new Ventana();
	    widget.resize(250, 150);
	    widget.move(300, 300);
	    widget.show();
	    QApplication.exec();
	}
	   public Ventana(){
		   cmb = new QComboBox();
		   cmb.addItem("ciculo");
		   cmb.addItem("cuadrado");
		   //cmb.addItem("triangulo");
		   //cmb.currentIndexChanged.connect(this, "cmbChanged(int)");
		   
		   textEdit = new QTextEdit();
		   textEdit.setFocusPolicy(Qt.FocusPolicy.NoFocus);
		   textEdit.setReadOnly(true);
		
		   QPushButton ok = new QPushButton("ok", this);
		   ok.clicked.connect(this, "okPressed()");
		   
		   QGridLayout echoLayout = new QGridLayout();
		   echoLayout.addWidget(cmb, 0, 0);
		   echoLayout.addWidget(textEdit, 1, 0);
		   echoLayout.addWidget(ok, 2, 0);
		   setLayout(echoLayout);
	   }
	   
	   private void okPressed(){
		   String perimetro = "";
		   switch (cmb.currentIndex()) {
		case 0:
			figuraGeometrica = new Circulo(10);
			//downcasting
			perimetro = String.valueOf(Calculador.getPerimetro((Circulo)figuraGeometrica));
			//upcasting
			break;
		case 1:
			figuraGeometrica = new Cuadrado(10);
			perimetro = String.valueOf(Calculador.getPerimetro((Cuadrado)figuraGeometrica));;
			break;
		default:
			break;
		
		}
		textEdit.setText(String.valueOf(figuraGeometrica.getArea())+"/n/r"+" y el perimetro es "+perimetro);
	   }
}