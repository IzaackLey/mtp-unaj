package st2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import st1.FiguraGeometrica;

public class ConjutoDeFiguras {
	ArrayList<FiguraGeometrica> arrLstFiguras = new ArrayList<FiguraGeometrica>();
	Comparator<FiguraGeometrica> compratorStrategy;
	
	public ConjutoDeFiguras(){
		compratorStrategy = new OrdenarFiguraGeometricaPorArea();
	}
	
	public void setComparatorStrategy(Comparator<FiguraGeometrica> compratorStrategy){
		this.compratorStrategy =  compratorStrategy;
	}
	
	public void addFigura(FiguraGeometrica figura){
		arrLstFiguras.add(figura);
	}
	
	public void delFigura(FiguraGeometrica figura){
		arrLstFiguras.remove(figura);
	}
	
	public double getArea(){
		double totalArea = 0;
		Iterator<FiguraGeometrica> itr = arrLstFiguras.iterator(); 
		while(itr.hasNext()) {
			FiguraGeometrica figura = itr.next(); 
			totalArea = totalArea + figura.getArea();
		}
		return totalArea;
	}
	
	public ArrayList<FiguraGeometrica> getFiguras(){
		Collections.sort(this.arrLstFiguras, this.compratorStrategy);
		return this.arrLstFiguras;
	}
//	public ArrayList<FiguraGeometrica> getFigurasPorArea(){
//		Collections.sort(arrLstFiguras);
//		return this.arrLstFiguras;
//	}
//	
//	public ArrayList<FiguraGeometrica> getFigurasPorNombre(){
//		Collections.sort(arrLstFiguras, new OrdenarFiguraPorNombre());
//		return this.arrLstFiguras;
//	}
	
}
