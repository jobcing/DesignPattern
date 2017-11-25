package composite;

import java.util.Iterator;

public class Music extends MusicComponent {
	String title;
	String singer;
    
	public Music(String title, String singer){
		this.title = title;
		this.singer = singer;
	}
  
	public String getTitle() {
		return title;
	}
  
	public String getSinger(){
		return singer;
	}
  
	public void print() {
		System.out.print(getTitle());
		System.out.println(" - " + getSinger());
	}
	
	public Iterator createIterator(){
		return new NullIterator();
	}
}
