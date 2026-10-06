import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ATM {

	// instance varible of bank account 
	BankAccount bankAccount = new BankAccount(0);

	ATM(BankAccount bankaccount) {
		bankAccount.balance = 500;

	}


	void handleTransactions() {
		
		try {
			// withdraw 600 dollars do a try catch to make 
			// testing 
			bankAccount.withdraw(600);
			bankAccount.quickWithdraw(600);
			
		}
		catch(NegativeBalanceException e) {
		System.out.println(e);
		System.out.println(e.getMessage());
		
		}

	}
		
		
	public static void main(String[] args) {
		BankAccount b = new BankAccount(0);
		ATM a = new ATM(b);
		
		a.handleTransactions();

	}

}





