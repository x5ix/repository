package patterns.decorator;

public abstract class APrintDecorator implements IPrinter {
	IPrinter printer;

	public APrintDecorator(IPrinter printer) {
		super();
		this.printer = printer;
	}
	
}
