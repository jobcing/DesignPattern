package iterator;

import java.util.Iterator;

public class BugsPlaylist implements Playlist {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	Music[] playlist;
  
	public BugsPlaylist() {
		playlist = new Music[MAX_ITEMS];
 
		addMusic("TT", "트와이스");
		addMusic("불장난", "블랙핑크");
		addMusic("우주를 줄게", "볼빨간 사춘기");
		addMusic("11:11", "태연");
		addMusic("너무너무너무", "아이오아이");
		addMusic("가끔", "긱스");
	}
  
	public void addMusic(String title, String singer){
		Music music = new Music(title, singer);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, list is full!  Can't add music to list");
		} else {
			playlist[numberOfItems] = music;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public Music[] getPlaylist() {
		return playlist;
	}
  
	public Iterator<Music> createIterator() {
		return new BugsIterator(playlist);
		//return new AlternatingDinerMenuIterator(menuItems);
	}
 
	// other menu methods here
}
