package patterns.builder;

public abstract class TrainBuilder {
	Train train;
	
	void createTrain() {train = new Train();}
	Train getTrain() {return train;}
	
	abstract void buildNumber();
	abstract void buildType();
}
