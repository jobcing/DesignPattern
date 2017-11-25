package decoPattern;

public class CheeseCrust extends CondimentDecorator {
	Pizza pizza;
	
	public CheeseCrust(Pizza pizza){
		this.pizza = pizza; // 감싸고자하는 피자 객체 값을 설정한다.
	}
	
	public String getDescription(){
		return pizza.getDescription() + ", 치즈크러스트";
	}
	
	public double cost(){
		return 0.50 + pizza.cost(); // 감싸고있는 피자 객체의 가격에 치즈크러스트 가격을 더한 값을 리턴한다.
	}
}
