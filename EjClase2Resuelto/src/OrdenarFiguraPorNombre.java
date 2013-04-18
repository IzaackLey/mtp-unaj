import java.util.Comparator;

public class OrdenarFiguraPorNombre implements Comparator<FiguraGeometrica>{
	public int compare(FiguraGeometrica f1, FiguraGeometrica f2) {
		return f1.nombre.compareTo(f2.nombre) ;
	}
}
