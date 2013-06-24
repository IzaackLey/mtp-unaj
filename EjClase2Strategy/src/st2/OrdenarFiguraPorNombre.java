package st2;
import java.util.Comparator;
import st1.FiguraGeometrica;

public class OrdenarFiguraPorNombre implements Comparator<FiguraGeometrica>{
	public int compare(FiguraGeometrica f1, FiguraGeometrica f2) {
		return f1.nombre.compareTo(f2.nombre) ;
	}
}
