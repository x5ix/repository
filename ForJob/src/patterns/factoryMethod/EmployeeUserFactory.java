package patterns.factoryMethod;

public class EmployeeUserFactory implements IUserFactory {

	@Override
	public IUser createUser() {
		return new EmployeeUser();
	}
	
}
