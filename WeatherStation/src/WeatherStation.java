import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QPushButton;


public class WeatherStation {


	public static void main(String[] args) {
//		QApplication.initialize(args);
//		 
//        QPushButton hello = new QPushButton("Hello World!");
//        hello.setWindowTitle("Hola todos");
//        hello.resize(250, 200);
//        hello.show();
// 
//        QApplication.exec();
		WeatherData wheatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(wheatherData);
		
		wheatherData.setMesurements(34, 98, 1100);
		
	}

}
