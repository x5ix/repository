package patterns.decorator;

public class QuotesPrintDecorator extends APrintDecorator {
	
	public QuotesPrintDecorator(IPrinter printer) {
		super(printer);
	}

	@Override
	public void print() {
		System.out.print("\"");
		super.printer.print();
		System.out.print("\"");
	}
}