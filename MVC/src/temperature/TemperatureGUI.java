package temperature;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;

public abstract  class TemperatureGUI implements java.util.Observer{
//tiene toda la funcionalidad pero no tiene escuchadores para los botones y campos
//como la clase es abstracta no me obliga a implementar por ser observer
//esto va a ser implementado en las subclases	
	private TemperatureModel model;
	
	private String label;
	private Frame temperatureFrame;
	private TextField display = new TextField();
	private Button upButton = new Button("Raise");
	private Button downButton = new Button("Lower");
	
	TemperatureGUI(String label, TemperatureModel model, int h, int v)
	{	
		this.model = model;
		model.addObserver(this); // Connect the View to the Model
		this.label = label;

		temperatureFrame = new Frame(label);
		temperatureFrame.add("North", new Label(label));
		temperatureFrame.add("Center", display);
		Panel buttons = new Panel();
		buttons.add(upButton);
		buttons.add(downButton);		
		temperatureFrame.add("South", buttons);		
		temperatureFrame.addWindowListener(new CloseListener());	
		temperatureFrame.setSize(200,100);
		temperatureFrame.setLocation(h, v);
		temperatureFrame.setVisible(true);
	}
	public void addDisplayListener(ActionListener a){ 
		display.addActionListener(a);
	}
	public void addUpListener(ActionListener a){ 
		upButton.addActionListener(a);
	}
	public void addDownListener(ActionListener a){ 
		downButton.addActionListener(a);
	}
	//estos metodos son para agregar escuchadores a textbox y los buttons
	
	protected TemperatureModel model(){
		return model;
	}
	
	public static class CloseListener extends WindowAdapter
	{	public void windowClosing(WindowEvent e)
		{	e.getWindow().setVisible(false);
			System.exit(0);
		}
	}
}
