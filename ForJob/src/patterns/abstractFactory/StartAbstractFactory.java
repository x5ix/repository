package patterns.abstractFactory;

public class StartAbstractFactory {
	public static void main(String[] args) {
		ITravelFactory myTravel = getTravelFactory("02");
		ITrain myTrain = myTravel.getTrain();
		myTrain.ride();
		IAirplane myAirplane = myTravel.getAirplane();
		myAirplane.fly();
	}
	public static ITravelFactory getTravelFactory(String factoryName) {
		switch (factoryName) {
			case "01":
				return new TravelFactory01();
			case "02":
				return new TravelFactory02();
			default:
				throw new RuntimeException("Такого маршрута не  сущесвует " + factoryName);
		}
			
		
	}
}
