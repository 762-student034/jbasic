package p17;

public class Start {

	public static void main(String[] args) {
		Kodomo k1 = new Kodomo();
		k1.m1();
		k1.m2();

		System.out.println();

		Oya o1 = new Oya();
		o1.m1();

		System.out.println();
		//		Kodomo k2 = (Kodomo) new Oya();
		//		Kodomo k3 = (Kodomo)o1;

		Oya o2 = new Kodomo();
		o2.m1();

		System.out.println();

		Kodomo k2 = (Kodomo) o2;
		k2.m1();
		k2.m2();

		System.out.println();

		System.out.println(k1 instanceof Kodomo);
		System.out.println(k1 instanceof Oya);
		System.out.println(o1 instanceof Kodomo);
		System.out.println(o1 instanceof Oya);
		System.out.println(k2 instanceof Kodomo);
		System.out.println(k2 instanceof Oya);
	}
}
