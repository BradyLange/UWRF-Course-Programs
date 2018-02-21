package Time;

public class InvalidPrdException extends Exception {
	
	public InvalidPrdException()
	{
		super("Period must be either 'AM' or 'PM'.");
	}

}
