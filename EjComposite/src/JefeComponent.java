import java.util.*;

public abstract class JefeComponent {
   
	public void add(JefeComponent jefeComponet) {
		throw new UnsupportedOperationException();
	}
	public void remove(JefeComponent jefeComponet) {
		throw new UnsupportedOperationException();
	}
	public JefeComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
  
	public String getNombre() {
		throw new UnsupportedOperationException();
	}
	public String getFuncion() {
		throw new UnsupportedOperationException();
	}
	public String getArea() {
		throw new UnsupportedOperationException();
	}
	public abstract Iterator<JefeComponent> createIterator();
	
	public void print() {
		throw new UnsupportedOperationException();
	}
}
