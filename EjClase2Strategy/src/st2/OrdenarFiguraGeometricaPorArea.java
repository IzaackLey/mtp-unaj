package st2;

import java.util.Comparator;

import st1.FiguraGeometrica;

public class OrdenarFiguraGeometricaPorArea  implements Comparator<FiguraGeometrica>{

	public int compare(FiguraGeometrica f1, FiguraGeometrica f2) {
		return Double.compare(f1.getArea(), f2.getArea());
	}

}
