package patterns.facade;

public class Room {
	private boolean roomVacant = true;
	
	public boolean roomIsFree() {
		return roomVacant;
	}
	
	public void roomReservation() {
		System.out.println("����� �����!");
		roomVacant = false;
	}
	
	public void vacateTheRoom() {
		System.out.println("����� ��������!");
		roomVacant = true;
	}
}
