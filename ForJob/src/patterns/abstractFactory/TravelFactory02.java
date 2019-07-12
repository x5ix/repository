package patterns.abstractFactory;

public class TravelFactory02 implements ITravelFactory {

	@Override
	public IAirplane getAirplane() {
		return new Airplane02();
	}
	@Override
	public ITrain getTrain() {
		return new Train02();
	}


}
