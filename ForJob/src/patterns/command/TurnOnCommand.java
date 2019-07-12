package patterns.command;

public class TurnOnCommand implements Command {
	Tumbler tumbler;
	
	public TurnOnCommand(Tumbler tumbler) {
		this.tumbler = tumbler;
	}
	
	@Override
	public void execute() {
		tumbler.turnOn();
	}
}
