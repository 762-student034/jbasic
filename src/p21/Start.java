package p21;

public class Start {

	public static void main(String[] args) {
		Japan j;
		
		Kose k = new Kose();

		
		System.out.println(Japan.ANTHEM);
		System.out.println();
		k.work();
		k.tax();
		k.education();
		System.out.println();
		
		j = new Hirai();
		
		j.work();
		j.tax();
		j.education();
		
	}
}
