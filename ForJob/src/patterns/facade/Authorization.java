package patterns.facade;

public class Authorization {
	void authorizationSuccess() {
		System.out.println("Вход выполнен!");
	}
	void authorizationFail() {
		System.out.println("Не удалось войти!");
	}
}
