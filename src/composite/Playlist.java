package composite;

import java.util.Iterator;
import java.util.ArrayList;

public class Playlist extends MusicComponent {
	ArrayList<MusicComponent> musicComponents = new ArrayList<MusicComponent>();
	String listname;
  
	public Playlist(String listname) {
		this.listname = listname;
	}
 
	public void add(MusicComponent menuComponent) {
		musicComponents.add(menuComponent);
	}
 
	public void remove(MusicComponent menuComponent) {
		musicComponents.remove(menuComponent);
	}
 
	public MusicComponent getChild(int i) {
		return (MusicComponent)musicComponents.get(i);
	}
 
	public String getName() {
		return listname;
	}
 
	public void print() {
		System.out.print("\n-------" + getName());
		System.out.println("-------");
  
		Iterator<MusicComponent> iterator = musicComponents.iterator();
		while (iterator.hasNext()) {
			MusicComponent musicComponent = 
				(MusicComponent)iterator.next();
			musicComponent.print();
		}
	}
	
	public Iterator createIterator(){
		return new CompositeIterator(musicComponents.iterator());
	}
}
