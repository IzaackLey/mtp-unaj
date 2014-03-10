package st1;
import java.util.ArrayList;
import java.util.Collections;


public class SortByName implements SortStrategy{
	public ArrayList<FiguraGeometrica> sort(ArrayList<FiguraGeometrica> figurasGeometricas) {
		Collections.sort(figurasGeometricas, new OrdenarFiguraPorNombre());
		return figurasGeometricas;
	}
}
