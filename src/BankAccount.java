
public class BankAccount {

	public double balance = 0;
	public double negativeBalance = 0;

	public BankAccount(double balance) {

		this.balance = balance;
	}

	public void withdraw(double amount) throws NegativeBalanceException {

		// check if withdraw amount is more than balance 
		if (amount > balance) {
			double overdue = amount - balance;
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
