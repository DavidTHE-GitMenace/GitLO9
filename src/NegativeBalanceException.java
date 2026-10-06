
public class NegativeBalanceException extends Exception {
	
	public NegativeBalanceException() {
		super("Error: negative balance");
	}
	
	public NegativeBalanceException(double overdue) {
		super("Error: Amount exceeds balance by [" + overdue + "]");
	}
}
