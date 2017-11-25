package iterator;

import java.util.Iterator;
  
public class Client {
	Playlist melonPlaylist;
	Playlist bugsPlaylist;
	Playlist geniePlaylist;
 
	public Client(Playlist melonPlaylist, Playlist bugsPlaylist, Playlist geniePlaylist) {
		this.melonPlaylist = melonPlaylist;
		this.bugsPlaylist = bugsPlaylist;
		this.geniePlaylist = geniePlaylist;
	}
 
	public void printMusic() {
		Iterator<Music> melonIterator = melonPlaylist.createIterator();
		Iterator<Music> bugsIterator = bugsPlaylist.createIterator();
		Iterator<Music> genieIterator = geniePlaylist.createIterator();

		System.out.println("\n-----Melon Playlist-----");
		printMusic(melonIterator);
		System.out.println("\n-----Bugs Playlist-----");
		printMusic(bugsIterator);
		System.out.println("\n-----Genie Playlist-----");
		printMusic(genieIterator);
	}
 
	private void printMusic(Iterator<Music> iterator) {
		while (iterator.hasNext()) {
			Music music = iterator.next();
			System.out.print(music.getTitle() + " - ");
			System.out.println(music.getSinger());
		}
	}
}

