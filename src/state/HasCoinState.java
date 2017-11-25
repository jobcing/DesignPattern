package state;

public class HasCoinState implements State {
    CoinExchange coinExchange;
 
    public HasCoinState(CoinExchange coinExchange) {
        this.coinExchange = coinExchange;
    }
       
	public void insertMoney() {
		System.out.println("Please wait, we're already giving you a coin");
	}
 
	public void ejectMoney() {
		System.out.println("Sorry, you already exchanged coin");
	}
 
	public void onButton() {
		System.out.println("Pushing twice doesn't get you another coin!");
	}
 
	public void dispense() {
		coinExchange.releaseCoins();
		if (coinExchange.getCount() > 10) {
			coinExchange.setState(coinExchange.getNoMoneyState());
		} else {
			System.out.println("Oops, out of coins!");
			coinExchange.setState(coinExchange.getNoCoinState());
		}
	}

	public String toString() {
		return "dispensing a coin";
	}
}
