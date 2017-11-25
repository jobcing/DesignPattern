package iterator;
 
import java.util.Iterator;
  
public class BugsIterator implements Iterator<Music> {
	Music[] playlist;
	int position = 0;
 
	public BugsIterator(Music[] playlist) {
		this.playlist = playlist;
	}
 
	public Music next() {
		Music music = playlist[position];
		position = position + 1;
		return music;
	}
 
	public boolean hasNext() {
		if (position >= playlist.length || playlist[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove an item until you've done at least one next()");
		}
		if (playlist[position-1] != null) {
			for (int i = position-1; i < (playlist.length-1); i++) {
				playlist[i] = playlist[i+1];
			}
			playlist[playlist.length-1] = null;
		}
	}

}
