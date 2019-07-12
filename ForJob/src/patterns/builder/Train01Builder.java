package patterns.builder;

public class Train01Builder extends TrainBuilder {

	@Override
	void buildNumber() {
		super.train.setNumber("01");
	}

	@Override
	void buildType() {
		super.train.setType(Type.HIGH_SPEED);
	}
}
