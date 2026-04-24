package p20;

public class Start {

	public static void main(String[] args) {
		//		Controller c = new Controller();

		Controller[] list = {
				new Baseball(),
				new Mario()
		};

		for (Controller element : list) {
			element.pushA();
			element.pushB();
			System.out.println();
		}
		for (Controller c : list) {
			c.pushA();
			c.pushB();
			System.out.println();
		}
	}
}
