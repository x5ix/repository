package patterns.protorype;

public class StartPrototype {
	public static void main(String[] args) {
		User u1 = new User("User", "User");
		User u2 = (User)new UserCreator(u1).createCopy();
		System.out.println(u1);
		System.out.println(u2);

	}
}
