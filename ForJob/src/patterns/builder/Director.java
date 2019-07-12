package patterns.builder;

public class Director {
	public TrainBuilder trainBuilder;
	public void setTrainBuilder(TrainBuilder trainBuilder) {this.trainBuilder = trainBuilder;}
	public Train getTrain() {return trainBuilder.getTrain();}
	
	public void constructTrain() {
		trainBuilder.createTrain();
		trainBuilder.buildNumber();
		trainBuilder.buildType();
	}
}