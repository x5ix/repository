package patterns.composite;

public class UserGuest implements IUser{
	private String login;

	public UserGuest(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public void printDescription() {
		System.out.println("UserGuest [login=" + login + "]");
	}
	
}
