package customPackage;

public class InsufficientBalanaceException extends RuntimeException{
	private String message;
	
	InsufficientBalanaceException(String message){
		this.message=message;
		
	}
	@Override
	public String getMessage() {
		return message;
	}
	

}
