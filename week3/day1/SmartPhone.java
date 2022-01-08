package week3.day1;

public class SmartPhone extends Mobile {
	public void accessWhatsApp() {
		System.out.println("used to see Whats App");

	}

	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone();
		smartphone.sendMsgs();
		smartphone.makeCall();
		smartphone.saveContact();
		smartphone.accessWhatsApp();

	}

}
