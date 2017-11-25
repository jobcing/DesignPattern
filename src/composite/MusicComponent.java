package composite;

import java.util.Iterator;

public abstract class MusicComponent {
   
	public void add(MusicComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public void remove(MusicComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public MusicComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
  
	public String getTitle() {
		throw new UnsupportedOperationException();
	}
	public String getSinger(){
		throw new UnsupportedOperationException();
	}
  
	public void print() {
		throw new UnsupportedOperationException();
	}
	
	public abstract Iterator<MusicComponent> createIterator();
}
