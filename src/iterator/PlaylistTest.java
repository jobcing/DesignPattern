package iterator;

public class PlaylistTest {
	public static void main(String args[]) {
		MelonPlaylist melonPlaylist = new MelonPlaylist();
		BugsPlaylist bugsPlaylist = new BugsPlaylist();
		GeniePlaylist geniePlaylist = new GeniePlaylist();
 
		Client client = new Client(melonPlaylist, bugsPlaylist, geniePlaylist);
		
		System.out.println("***** United Music Playlist *****");
		client.printMusic();
	}
}
