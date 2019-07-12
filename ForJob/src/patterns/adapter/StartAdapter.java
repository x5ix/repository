package patterns.adapter;

public class StartAdapter {

	public static void main(String[] args) {
		MSWord MSDoc = new MSWord("some text");
		TxtRedactor txtDoc = new Converter(MSDoc);
		System.out.println(txtDoc.getText());
	}
}
