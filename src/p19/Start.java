package p19;

public class Start {

	public static void main(String[] args) {
		
		Human[] list = new Human[2];
		
		list [0] = new Ogawa();
		list [1] = new Sato();
		
		for (int i = 0; i < list.length; i++) {
			list[i].eat();
		}
		
		System.out.println();
		
		for (Human h : list) {
			h.eat();
		}
		
	}
}
