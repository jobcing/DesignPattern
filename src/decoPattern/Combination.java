package decoPattern;

public class Combination extends Pizza{
	public Combination(){
		description = "콤비네이션 피자"; // 생성자에서 Pizza로부터 상속받은 변수의 값을 설정해준다.
	}
	
	public double cost(){
		return 5.99; // 콤비네이션 가격을 리턴
	}
}
