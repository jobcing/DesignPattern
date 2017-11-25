package state;

public class CoinExchangeTestDrive {

	public static void main(String[] args) {
		CoinExchange coinExchange = new CoinExchange(100);

		System.out.println(coinExchange);

		coinExchange.insertMoney();
		coinExchange.onButton();
		
		coinExchange.onButton();
		
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println(coinExchange);

		coinExchange.insertMoney();
		coinExchange.ejectMoney();
	}
}
