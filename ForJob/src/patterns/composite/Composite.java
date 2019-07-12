package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IUser{
	
	private List<IUser> composite = new ArrayList<IUser>();
	
	public void add(IUser user) {
		composite.add(user);
	}
	
	public void remove(IUser user) {
		composite.remove(user);
	}
	
	public void printDescription() {
		for(IUser u : composite) {
			u.printDescription();
		}
	}
}
