package Time;

public class InvalidSecException extends Exception {
	
	public InvalidSecException(String str)
	{
		super("Seconds must be 1 to 59. " + str);
	}

}
