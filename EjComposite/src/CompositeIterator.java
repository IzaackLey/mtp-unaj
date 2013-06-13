 
import java.util.*;
  
public class CompositeIterator implements Iterator<JefeComponent> {
	Stack<Iterator<JefeComponent>> stack = new Stack<Iterator<JefeComponent>>();
   
	public CompositeIterator(Iterator<JefeComponent> iterator) {
		stack.push(iterator);
	}
   
	public JefeComponent next() {
		if (hasNext()) {
			Iterator<JefeComponent> iterator = stack.peek();
			JefeComponent component = (JefeComponent) iterator.next();
			if (component instanceof Jefe) {
				stack.push(component.createIterator());
			} 
			return component;
		} else {
			return null;
		}
	}
  
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator<JefeComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
   
	public void remove() {
		throw new UnsupportedOperationException();
	}
}


