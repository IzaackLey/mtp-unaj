
public class Decorador extends Componente{
	  protected Componente componente;
	    public void setComponente(Componente component) {
	        this.componente = component;
	    }
	    
	    public void operacion() {
	        if (componente != null) {
	            componente.operacion();
	        }
	    }
}
