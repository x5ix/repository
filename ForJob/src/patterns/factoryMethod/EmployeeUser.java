package patterns.factoryMethod;

public class EmployeeUser implements IUser {

	@Override
	public void action() {
		System.out.println("Заселяет гостей");
	}
	
}
