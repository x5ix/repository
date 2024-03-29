package patterns.composite;

public class UserAdmin implements IUser {
	private String login;
	private String password;
	public UserAdmin(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public void printDescription() {
		System.out.println("UserAdmin [login=" + login + ", password=" + password + "]");
	}

}
