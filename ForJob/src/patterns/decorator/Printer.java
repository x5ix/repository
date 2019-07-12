package patterns.decorator;

public class Printer implements IPrinter  {
	
	private String text;

	public Printer(String text) {
		this.text = text;
	}
	
	@Override
	public void print() {
		System.out.print(text);
	}
}
