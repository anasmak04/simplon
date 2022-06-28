package Models;

public class User {
	private String Namee ,Email ,Passwordd;

	public User(String namee, String email, String passwordd) {
		super();
		Namee = namee;
		Email = email;
		Passwordd = passwordd;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getNamee() {
		return Namee;
	}

	public void setNamee(String namee) {
		Namee = namee;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPasswordd() {
		return Passwordd;
	}

	public void setPasswordd(String passwordd) {
		Passwordd = passwordd;
	}

}
