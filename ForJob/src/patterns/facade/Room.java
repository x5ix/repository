package patterns.facade;

public class Room {
	private boolean roomVacant = true;
	
	public boolean roomIsFree() {
		return roomVacant;
	}
	
	public void roomReservation() {
		System.out.println("Номер занят!");
		roomVacant = false;
	}
	
	public void vacateTheRoom() {
		System.out.println("Номер свободен!");
		roomVacant = true;
	}
}
