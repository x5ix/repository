package patterns.protorype;

enum Type{
	ADMIN, GUEST;
}

public class User implements IPrototype{
	private String login;
	private String password;
	
	public User(String login, String password) {
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
	@Override
	public String toString() {
		return "Login: "+login+" password: "+password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public Object copy() {
		return new User(this.login, this.password);
	}
}
