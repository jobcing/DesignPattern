package decoPattern;

public abstract class CondimentDecorator extends Pizza {
	// Beverage 객체가 들어갈 자리에 들어갈 수 있어야 하므로 Beverage 클래스를 확장한다.
	public abstract String getDescription();
}
