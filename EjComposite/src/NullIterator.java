import java.util.Iterator;
  
public class NullIterator implements Iterator<JefeComponent> {
   
	public JefeComponent next() {
		return null;
	}
	public boolean hasNext() {
		return false;
	}
   
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
