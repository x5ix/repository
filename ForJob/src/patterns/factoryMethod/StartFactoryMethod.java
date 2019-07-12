package patterns.factoryMethod;

public class StartFactoryMethod {

	public static void main(String[] args) {
		IUserFactory uFactory = getFactoryByName("emplyee");
		IUser user = uFactory.createUser();
		user.action();
	}
	
	static IUserFactory getFactoryByName(String nameUser) {
		switch (nameUser) {
			case "guest":
				return new GuestUserFactory();
			case "employee":
				return new EmployeeUserFactory();
			default:
				throw new RuntimeException("Не известный пользователь " + nameUser);
		
		}
	}
}
