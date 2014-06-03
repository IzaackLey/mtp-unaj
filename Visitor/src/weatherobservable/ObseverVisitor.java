package weatherobservable;
import java.util.Observable;

public interface ObseverVisitor {
	public void visit(StatisticsDisplay statisticsDisplay, Observable o);
	public void visit(ForecastDisplay forecastDisplay, Observable o);
	public void visit(HeatIndexDisplay heatIndexDisplay, Observable o);
}
