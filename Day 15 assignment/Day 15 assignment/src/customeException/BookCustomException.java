package customeException;

@SuppressWarnings("serial")
public class BookCustomException extends Exception{
	
	public BookCustomException(String mesg) {
		super(mesg);
	}

}
