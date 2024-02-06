package Javabean;

public class Instagrm {
	private String email;
	private String password;

	public void setEmail(String email) {
		if(email.contains("@")) {
			this.email=email;
			System.out.println("email is valid");
		}
		else {
			System.out.println("invalid");
		}

	}
	public String getEmail() {
		return email;
	}

	public void setPassword(String password) {
		if(password.length()>=8) {
			this.password=password;
			System.out.println("password is valid");
		}
		else {
			System.out.println("invalid");
		}

	}
	public String getPassword() {
		return password;
	}

}
