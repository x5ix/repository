package patterns.protorype;

public class UserCreator {
	private User user;

	public UserCreator(User user) {
		super();
		this.user = user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Object createCopy() {
		return this.user.copy();
	}
}
