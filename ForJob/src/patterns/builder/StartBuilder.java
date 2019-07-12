package patterns.builder;

public class StartBuilder {

	public static void main(String[] args) {
		Director director = new Director();
		director.setTrainBuilder(new Train02Builder());
		director.constructTrain();
		Train train = director.getTrain();
		System.out.println(train);
	}
}
