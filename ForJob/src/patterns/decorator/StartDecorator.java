package patterns.decorator;

public class StartDecorator {
	public static void main(String[] args) {
		
		IPrinter printer = new Printer("some text");
		APrintDecorator printDecor = new BracesPrintDecorator(new QuotesPrintDecorator(printer)) ;
		printDecor.print();
	}
}