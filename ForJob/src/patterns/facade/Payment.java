package patterns.facade;

public class Payment {
	
	public void pay() {
		
		Authorization au = new Authorization();
		Room room = new Room();
		Card card = new Card();
		
		au.authorizationSuccess();
		card.cardBinding();
		if(room.roomIsFree()) {
			System.out.println("������ ������...");
			room.roomReservation();
		}
		
	}
}
