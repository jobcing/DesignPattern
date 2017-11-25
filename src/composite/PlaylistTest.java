package composite; 

public class PlaylistTest {
	public static void main(String args[]) {
		MusicComponent melonPlaylist = new Playlist("Melon Playlist");
		MusicComponent bugsPlaylist= new Playlist("Bugs Playlist");
		MusicComponent geniePlaylist = new Playlist("Genie Playlist");
		MusicComponent melonFavoriteList = new Playlist("Melon Favorite Playlist");
  
		MusicComponent allMusic = new Playlist("All Music Combined");
  
		allMusic.add(melonPlaylist);
		allMusic.add(bugsPlaylist);
		allMusic.add(geniePlaylist);
  
		melonPlaylist.add(new Music("TT", "트와이스"));
		melonPlaylist.add(new Music("11:11", "태연"));
		melonPlaylist.add(new Music("불장난", "블랙핑크"));
		melonPlaylist.add(melonFavoriteList);
		
		melonFavoriteList.add(new Music("우주를 줄게", "볼빨간 사춘기"));
		melonFavoriteList.add(new Music("너무너무너무", "아이오아이"));
		
		bugsPlaylist.add(new Music("이 소설의 끝을 다시 써보려해", "한동근"));
		bugsPlaylist.add(new Music("내가 저지른 사랑", "임창정"));
		
		geniePlaylist.add(new Music("그대라는 사치", "한동근"));
		geniePlaylist.add(new Music("남아있어", "로꼬"));
		geniePlaylist.add(new Music("널 너무 사랑해서", "MC몽"));
 
		Client client = new Client(allMusic);
   
		client.printMusic();
	}
}
