package patterns.factoryMethod;

public class GuestUser implements IUser {

	@Override
	public void action() {
		System.out.println("Заказывает номер");		
	}
	
}
