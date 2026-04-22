package p21;

public class Start2 {

	public static void main(String[] args) {
		Japan[] list = new Japan[2];
		
		list[0] = new Kose();
		list[1] = new Hirai();
		
		for (int i = 0; i < list.length; i++) {
			list[i].work();
			list[i].tax();
			list[i].education();
			System.out.println();
		}
		
		for (Japan j : list) {
			j.work();
			j.tax();
			j.education();
			System.out.println();
		}

		
	}
}
