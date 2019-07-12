package patterns.delegate;

public class Brush implements Tools {

	@Override
	public void draw() {
		System.out.println("’удожник рисует кистью");
	}

}
