package state;

public class CoinExchange {
 
	State noCoinState;
	State noMoneyState;
	State hasMoneyState;
	State hasCoinState;
 
	State state = noCoinState;
	int count = 0;
 
	public CoinExchange(int numberCoins) {
		noCoinState = new NoCoinState(this);
		noMoneyState = new NoMoneyState(this);
		hasMoneyState = new HasMoneyState(this);
		hasCoinState = new HasCoinState(this);

		this.count = numberCoins;
 		if (numberCoins > 10) {
			state = noMoneyState;
		} 
	}
 
	public void insertMoney() {
		state.insertMoney();
	}
 
	public void ejectMoney() {
		state.ejectMoney();
	}
 
	public void onButton() {
		state.onButton();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseCoins() {
		System.out.println("Coins are coming out...");
		if (count > 10) {
			count = count - 10;
		}
	}
 
	int getCount() {
		return count;
	}

    public State getState() {
        return state;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nCoin Exchange, Inc.");
		result.append("\nJava-enabled Standing Coin Machine Model #2004");
		result.append("\nInventory: " + count + " coins");
		result.append("\n");
		result.append("Machine is " + state + "\n");
		
		return result.toString();
	}
}
