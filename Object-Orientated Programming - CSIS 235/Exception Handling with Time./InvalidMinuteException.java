package Time;

public class InvalidMinException extends Exception {
	
	public InvalidMinException(String str)
	{
		super("Minutes must be 1 to 59. " + str);
	}

}
