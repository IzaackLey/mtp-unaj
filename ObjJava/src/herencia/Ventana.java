package herencia;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.core.*;

public class Ventana extends QWidget{

	public static void main(String[] args) {
	    QApplication.initialize(args);
	    Ventana widget = new Ventana();
	    widget.show();
	    QApplication.exec();
	}
	   public Ventana(){
	        QLabel echoLabel = new QLabel("Mode:");
		    QComboBox echoComboBox = new QComboBox();
		    echoComboBox.addItem("Normal");
		    echoComboBox.addItem("Password");
		    echoComboBox.addItem("No Echo");
		    
		    QTextEdit textEdit = new QTextEdit();
	        textEdit.setFocusPolicy(Qt.FocusPolicy.NoFocus);
	        textEdit.setReadOnly(true);
		    
			QGridLayout echoLayout = new QGridLayout();
			echoLayout.addWidget(echoLabel, 0, 0);
			echoLayout.addWidget(echoComboBox, 0, 1);
			echoLayout.addWidget(textEdit, 1, 0);
			setLayout(echoLayout);
	   }
}
