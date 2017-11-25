package decoPattern;

public abstract class Pizza {
	String description = "제목없음";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost(); // 서브클래스에서 구현해야한다.
}
