package decoPattern;

public class TestCoffee {
	public static void main(String args[]){
		Pizza pizza = new Combination();
		
		System.out.println(pizza.getDescription() + " $" + pizza.cost());
		
		Pizza pizza2 = new Potato();
		pizza2 = new GrainBase(pizza2);
		pizza2 = new CheeseCrust(pizza2);
		System.out.println(pizza2.getDescription() + " $" + pizza2.cost());
	}
}
