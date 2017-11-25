package composite;

import java.util.Iterator;

public class Client {
	MusicComponent allMusic;
 
	public Client(MusicComponent allMusic) {
		this.allMusic = allMusic;
	}
 
	public void printMusic() {
		Iterator iterator = allMusic.createIterator();
		
		while(iterator.hasNext()){
			MusicComponent musicComponent = (MusicComponent)iterator.next();
			musicComponent.print();
		}
	}
}
