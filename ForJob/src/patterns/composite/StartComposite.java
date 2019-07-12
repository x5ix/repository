package patterns.composite;

public class StartComposite {

	public static void main(String[] args) {
		UserAdmin admin1 = new UserAdmin("admin1", "admin1");
		UserAdmin admin2 = new UserAdmin("admin2", "admin2");
		Composite users = new Composite();
		Composite groupAdmin = new Composite();
		groupAdmin.add(admin1);
		groupAdmin.add(admin2);
		users.add(groupAdmin);
		users.add(new UserGuest("guest"));
		users.printDescription();		
	}
}
