package patterns.delegate;

public class StartDelegate {

	public static void main(String[] args) {
		Painter painter = new Painter();
		painter.setTool(new Chalk());
		painter.drawing();
		painter.setTool(new Pancil());
		painter.drawing();
	}

}
