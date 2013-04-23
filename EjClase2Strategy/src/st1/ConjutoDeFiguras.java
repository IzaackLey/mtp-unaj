package st1;
import java.util.ArrayList;
import java.util.Iterator;

public class ConjutoDeFiguras {
	ArrayList<FiguraGeometrica> arrLstFiguras = new ArrayList<FiguraGeometrica>();
	SortStrategy sortStrategy;
	
	public ConjutoDeFiguras(){
		sortStrategy = new SortByArea();
	}
	
	public void setSortStrategy(SortStrategy sortStrategy){
		this.sortStrategy =  sortStrategy;
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
		return sortStrategy.sort(this.arrLstFiguras);
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
