package patterns.decorator;

public class BracesPrintDecorator extends APrintDecorator {
	
	public BracesPrintDecorator(IPrinter printer) {
		super(printer);
	}

	@Override
	public void print() {
		System.out.print("{");
		super.printer.print();
		System.out.print("}");
	}
	
}
