package composite;
 
import java.util.Iterator;
  
public class NullIterator implements Iterator<MusicComponent> {
   
	public MusicComponent next() {
		return null;
	}
  
	public boolean hasNext() {
		return false; // 무조건 false를 리턴. 따로 조건문을 사용할 필요가 없는 이점이 있다.
	}
}
