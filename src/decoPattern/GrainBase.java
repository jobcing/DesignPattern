package decoPattern;

public class GrainBase extends CondimentDecorator {
	Pizza pizza;
	
	public GrainBase(Pizza pizza){
		this.pizza = pizza; // 감싸고자하는 피자 객체 값을 설정한다.
	}
	
	public String getDescription(){
		return pizza.getDescription() + ", 곡물도우";
	}
	
	public double cost(){
		return 0.20 + pizza.cost(); // 감싸고있는 피자 객체의 가격에 도우변경 가격을 더한 값을 리턴한다.
	}
}
