package patterns.command;

public class User {
	Command on;
	Command off;
	
	public User(Command on, Command off) {
		this.on = on;
		this.off = off;
	}
	
	void turnOn() {
		on.execute();
	}
	void turnOff() {
		off.execute();
	}
}
