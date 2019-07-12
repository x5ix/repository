package patterns.command;

public class StartCommand {
	public static void main(String[] str) {
		
		Tumbler tumbler = new Tumbler();
		User user = new User(new TurnOnCommand(tumbler), new TurnOffCommand(tumbler));
		user.turnOn();
		user.turnOff();
	}
}