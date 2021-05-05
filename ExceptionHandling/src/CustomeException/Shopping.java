package CustomeException;

public class Shopping {

	public int  buyProduct (int balance, int cost) {
		 
		if (balance<cost) {
			throw new ArithmeticException ("Insufficient Balance"+balance+"to buy"+cost);
		}
		return balance-cost;
	}
}
//finally can also be added