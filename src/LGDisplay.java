import java.util.Observable;
import java.util.Observer;

public class LGDisplay implements Observer, DisplayElement {
	Observable observable;
	private String[] searchWord = new String[10];
	
	public LGDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
		// 생성자에 주체 객체가 전달되고 그 객체를 사용하여 디스플레이를 옵저버로 등록.
	}
	
	@Override
	public void display() {
		System.out.println("(LG) 현재 검색 순위 >>");
		for(int i = 0; i < searchWord.length; i++){
			System.out.println((i + 1) +". " + searchWord[i]);
		}
	}

	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof SearchData){
			SearchData searchData = (SearchData)obs;
			this.searchWord = searchData.getWord();
			display();
		}
	}

}
