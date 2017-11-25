package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MelonPlaylist implements Playlist {
	ArrayList<Music> playlist;
 
	public MelonPlaylist() {
		playlist = new ArrayList<Music>();
    
		addMusic("남아있어", "로꼬");
		addMusic("이 소설의 끝을 다시 써보려 해", "한동근");
		addMusic("내가 저지른 사랑", "임창정");
		addMusic("널 너무 사랑해서", "MC몽");
	}

	public void addMusic(String title, String singer)
	{
		Music music = new Music(title, singer);
		playlist.add(music);
	}
 
	public ArrayList<Music> getPlaylist() {
		return playlist;
	}
  
	public Iterator<Music> createIterator() {
		return playlist.iterator(); // Arraylist이므로 별도의 Iterator 클래스필요없이 자바 내장 iterator()메소드 사용
	}
  
	// other menu methods here
}
