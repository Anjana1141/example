package customPackage;

public class InvalidPasswordException extends RuntimeException  {

	private String message;

	InvalidPasswordException(String message){
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}

/**
 *-> InvalidPasswordException extends RuntimeException -> unchecked Exception
 *->InvalidPasswordException extends Exception -> checked Exception
 */
