package patterns.builder;

public class Train02Builder extends TrainBuilder {

	@Override
	void buildNumber() {
		super.train.setNumber("02");
	}

	@Override
	void buildType() {
		super.train.setType(Type.EXPRESS);
	}
}
