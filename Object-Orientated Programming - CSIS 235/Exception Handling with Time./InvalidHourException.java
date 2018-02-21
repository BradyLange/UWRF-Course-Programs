package Time;

public class InvalidHrException extends Exception {

	public InvalidHrException(String str)
	{
		super("Hours can only be from 1 to 12. (12 hour clock format) " + str);
	}
}
