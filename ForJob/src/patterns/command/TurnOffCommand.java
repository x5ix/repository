package patterns.command;

public class TurnOffCommand implements Command {
	Tumbler tumbler;
	
	public TurnOffCommand(Tumbler tumbler) {
		this.tumbler = tumbler;
	}

	@Override
	public void execute() {
		tumbler.turnOff();
	}
}