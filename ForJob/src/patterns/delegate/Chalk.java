package patterns.delegate;

public class Chalk implements Tools {

	@Override
	public void draw() {
		System.out.println("’удожник рисует мелом");		
	}
}
