
public class BankAccount {

	public double balance;
	public double negativeBalance;

	public BankAccount(double balance){

		this.balance = balance;
	}


	public void withdraw(double amount) throws NegativeBalanceException {

		// check if withdraw amount is more than blance 
		if (amount > balance) {

			throw new NegativeBalanceException();

		}




	}

	void quickWithdraw() {



	}
	

}
