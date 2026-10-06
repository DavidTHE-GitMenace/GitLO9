import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NegativeBalanceException extends Exception {
	
	public NegativeBalanceException() {
		super("Error: negative balance");
	}
	
	public NegativeBalanceException(double overdue) {
		super("Error: Amount exceeds balance by [" + overdue + "]");
		
		Path path = Path.of("src/logfile.txt");
//		System.out.println("Writing log to: " + path.toAbsolutePath());
		
		String content = "Error: Amount exceeds balance by [" + overdue + "]";
		
		try {
			Files.writeString(path, content);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
