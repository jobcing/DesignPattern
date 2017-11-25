package state;

public class NoMoneyState implements State {
    CoinExchange coinExchange;
 
    public NoMoneyState(CoinExchange coinExchange) {
        this.coinExchange = coinExchange;
    }
 
	public void insertMoney() {
		System.out.println("You inserted a money");
		coinExchange.setState(coinExchange.getHasMoneyState());
	}
 
	public void ejectMoney() {
		System.out.println("You haven't inserted a money");
	}
 
	public void onButton() {
		System.out.println("There's no moeny");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for money...";
	}
}
