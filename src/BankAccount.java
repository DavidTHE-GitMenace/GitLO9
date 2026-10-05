
public class BankAccount {
	
public double balance;
	
	public BankAccount(double balance){
		
		this.balance = balance;
	}
	
	
	void withdraw(double amount) {
		
		// check if withdraw amount is more than blance 
		if (amount > balance ) {
			
			throw new BankAccountException("");
			
		}
		
		
		
		
	}
	
	void quickWithdraw() {
		
		
		
	}
	

}
