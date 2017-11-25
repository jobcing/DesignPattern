package composite;

import java.util.*;
  
public class CompositeIterator implements Iterator<MusicComponent> {
	Stack<Iterator<MusicComponent>> stack = new Stack<Iterator<MusicComponent>>();
   
	public CompositeIterator(Iterator<MusicComponent> iterator) {
		stack.push(iterator);
	}
   
	public MusicComponent next() {
		if (hasNext()) {
			Iterator<MusicComponent> iterator = stack.peek();
			MusicComponent component = iterator.next();
			if(component instanceof Music){
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
			Iterator<MusicComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
}


