package week3.day1.assignment;

public class Desktop extends Computer{
	private void desktopSize() {
		System.out.println("desktopsize");

	}
	
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		
		desktop.computerModel();
		desktop.desktopSize();

	}

}
