package p22;

public class Fruits {
	
	public static final void main(String[] args) {
//	System.out.println(FruitsEnum.ORANGE);
	
	for (FruitsEnum f : FruitsEnum.values()) {
		System.out.println(f);
	}
	}
}
