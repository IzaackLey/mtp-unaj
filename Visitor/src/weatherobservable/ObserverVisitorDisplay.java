package weatherobservable;

import java.util.Observable;

public class ObserverVisitorDisplay implements ObseverVisitor{

	public void visit(StatisticsDisplay statisticsDisplay) {

	}
	
	public void visit(ForecastDisplay forecastDisplay) {
		
	}

	public void visit(HeatIndexDisplay heatIndexDisplay) {
		
	}

	@Override
	public void visit(StatisticsDisplay statisticsDisplay, Observable o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ForecastDisplay forecastDisplay, Observable o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(HeatIndexDisplay heatIndexDisplay, Observable o) {
		// TODO Auto-generated method stub
		
	}

}
