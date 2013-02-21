package herencia;
import com.trolltech.qt.core.Qt.AlignmentFlag;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QHBoxLayout;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QVBoxLayout;
import com.trolltech.qt.gui.QWidget;
public class JambiApp extends QWidget{
	public JambiApp() {

        setWindowTitle("Windows");

        initUI();

        resize(350, 300);
        move(300, 300);
        show();        
    }

    private void initUI() {

        QVBoxLayout vbox = new QVBoxLayout(this);

        QVBoxLayout vbox1 = new QVBoxLayout();
        QHBoxLayout hbox1 = new QHBoxLayout();
        QHBoxLayout hbox2 = new QHBoxLayout();

        QLabel windLabel = new QLabel("Windows", this);
        QTextEdit edit = new QTextEdit(this);
        edit.setEnabled(false);

        QPushButton activate = new QPushButton("Activate", this);
        QPushButton close = new QPushButton("Close", this);
        QPushButton help = new QPushButton("Help", this);
        QPushButton ok = new QPushButton("OK", this);

        vbox.addWidget(windLabel);

        vbox1.addWidget(activate);
        vbox1.addWidget(close, 0, AlignmentFlag.AlignTop);
        hbox1.addWidget(edit);
        hbox1.addLayout(vbox1);

        vbox.addLayout(hbox1);

        hbox2.addWidget(help);
        hbox2.addStretch(1);
        hbox2.addWidget(ok);
        
        vbox.addLayout(hbox2, 1);

        setLayout(vbox);
    }
    
        
    public static void main(String[] args) {
        QApplication.initialize(args);
        new JambiApp();
        QApplication.exec();
    }
}
