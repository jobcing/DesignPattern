package state;

public class NoCoinState implements State {
    CoinExchange coinExchange;
 
    public NoCoinState(CoinExchange coinExchange) {
        this.coinExchange = coinExchange;
    }
 
	public void insertMoney() {
		System.out.println("You can't insert a money, the machine hasn't coin");
	}
 
	public void ejectMoney() {
		System.out.println("You can't eject, you haven't inserted a money yet");
	}
 
	public void onButton() {
		System.out.println("There are no coins");
	}
 
	public void dispense() {
		System.out.println("No coins dispensed");
	}
 
	public String toString() {
		return "There is no coin.";
	}
}
