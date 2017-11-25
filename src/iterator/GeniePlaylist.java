package iterator;

import java.util.*;

public class GeniePlaylist implements Playlist{
	HashMap<String, Music> playlist = new HashMap<String, Music>();
  
	public GeniePlaylist() {
		addMusic("그대라는 사치", "한동근");
		addMusic("돌아오지마", "헤이즈");
		addMusic("데칼코마니", "마마무");
		addMusic("내 옆에 그대인걸", "다비치");
	}
 
	public void addMusic(String title, String singer){
		Music music = new Music(title, singer);
		playlist.put(music.getTitle(), music);
	}
 
	public Map<String, Music> getPlaylist() {
		return playlist;
	}
  
	public Iterator<Music> createIterator() {
		return playlist.values().iterator();
	}
}
