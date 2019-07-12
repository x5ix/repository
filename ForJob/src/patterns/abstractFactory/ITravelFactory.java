package patterns.abstractFactory;

public interface ITravelFactory {
	ITrain getTrain();
	IAirplane getAirplane();
}
