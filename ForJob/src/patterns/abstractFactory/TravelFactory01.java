package patterns.abstractFactory;

public class TravelFactory01 implements ITravelFactory {

	@Override
	public ITrain getTrain() {
		return new Train01();
	}

	@Override
	public IAirplane getAirplane() {
		// TODO Auto-generated method stub
		return new Airplane01();
	}
	
}
