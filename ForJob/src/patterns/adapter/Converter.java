package patterns.adapter;

public class Converter implements TxtRedactor{
	private MSWord doc;

	public Converter(MSWord doc) {
		this.doc = doc;
	}

	@Override
	public String getText() {
		return doc.getText() ;
	}
}
