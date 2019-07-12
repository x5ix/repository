package patterns.builder;

enum Type{
	EXPRESS, HIGH_SPEED
}

public class Train {
	String number = "0";
	Type type = Type.EXPRESS;
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Train number: "+number+" type: "+type;
	}
	
}
