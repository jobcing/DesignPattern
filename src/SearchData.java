import java.util.Observable;
import java.util.Observer;

public class SearchData extends Observable{
	// Observable을 확장해서 서브클래스를 만든다.
	private String[] searchWord = new String[10];
	
	public SearchData(){ } // 옵저버들을 저장하기 위한 ArrayList를 만들 필요가 없다.
	
	public void measurementsChanged(){
		setChanged(); // 상태가 바뀌었다는 것을 밝히기 위한 용도로 쓰인다.
		notifyObservers();
		// 
	}

	public void setMeasurements(String[] searchWord){
		this.searchWord = searchWord;
		measurementsChanged();
	}
	
	public String[] getWord(){ // 전에 이 메소드를 생략했지만 옵저버가 데이터 상태를 알아낼때 사용
		return searchWord;
	}
}