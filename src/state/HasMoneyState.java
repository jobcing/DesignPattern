package state;

public class HasMoneyState implements State {
	CoinExchange coinExchange;
 
	public HasMoneyState(CoinExchange coinExchange) {
		this.coinExchange = coinExchange;
	}
  
	public void insertMoney() {
		System.out.println("You can't insert another money");
	}
 
	public void ejectMoney() {
		System.out.println("Money returned");
		coinExchange.setState(coinExchange.getNoMoneyState());
	}
 
	public void onButton() {
		System.out.println("Coins are being exchanged...");
		coinExchange.setState(coinExchange.getHasCoinState());
	}

    public void dispense() {
        System.out.println("No money dispensed");
    }
 
	public String toString() {
		return "waiting for exchange...";
	}
}
