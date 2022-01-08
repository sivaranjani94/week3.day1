package week3.day1;

public class AndroidPhone extends SmartPhone {
public void takeVideo() {
	System.out.println("used to take video");

}
	public static void main(String[] args) {
		AndroidPhone androidphone = new AndroidPhone();
		androidphone.sendMsgs();
		androidphone.makeCall();
		androidphone.saveContact();
		androidphone.accessWhatsApp();
		androidphone.takeVideo();
		
		
	}
		
	}
		