package patterns.factoryMethod;

public class GuestUserFactory implements IUserFactory {

	@Override
	public IUser createUser() {
		return new GuestUser();
	}
	
}
