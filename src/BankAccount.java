
public class BankAccount {

	public double balance;
	public double negativeBalance;

	public BankAccount(double balance){

		this.balance = balance;
	}

	public void withdraw(double amount) throws NegativeBalanceException {

		// check if withdraw amount is more than balance 
		if (amount > balance) {
			double overdue = balance - amount;
			throw new NegativeBalanceException(overdue);
		}
		
		this.balance -= amount;
	}

	public void quickWithdraw(double amount) throws NegativeBalanceException {
		
		// check if withdraw amount is more than balance 
				if (amount > balance) {
					throw new NegativeBalanceException();
				}
				
				this.balance -= amount;
		


	}
	

}
