package herencia;
import com.trolltech.qt.gui.*;
public class Test extends QWidget{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//FiguraGeometrica fig1 = new Circulo(10); 
		//System.out.println("el area del ciculo es " + fig1.getArea());
		QApplication.initialize(args);
        QWidget window = new QWidget();
 
        window.resize(200, 120);

        //QPushButton quit = new QPushButton("Quit", window);
        //quit.setFont(new QFont("Times", 18, QFont.Weight.Bold.value()));
        //quit.setGeometry(10, 40, 180, 40);
        //quit.clicked.connect(QApplication.instance(), "quit()");
        QLabel echoLabel = new QLabel("Mode:");
        QComboBox echoComboBox = new QComboBox();
        echoComboBox.addItem("Normal");
        echoComboBox.addItem("Password");
        echoComboBox.addItem("No Echo");
        
        QGridLayout echoLayout = new QGridLayout();
        echoLayout.addWidget(echoLabel, 0, 0);
        echoLayout.addWidget(echoComboBox, 0, 1);
        //echoLayout.addWidget(echoLineEdit, 1, 0, 1, 2);
        //echoGroup.setLayout(echoLayout);
        
        window.setWindowTitle("FamilyValues");
        window.show();
        QApplication.exec();
	}
	
	

}
