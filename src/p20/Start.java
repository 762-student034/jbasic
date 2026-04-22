package p20;

public class Start {

	public static void main(String[] args) {
		//		Controller c = new Controller();

		Controller[] list = {
				new Baseball(),
				new Mario()
		};

		for (int i = 0; i < list.length; i++) {
			list[i].pushA();
			list[i].pushB();
			System.out.println();
		}
		for (Controller c : list) {
			c.pushA();
			c.pushB();
			System.out.println();
		}
	}
}
