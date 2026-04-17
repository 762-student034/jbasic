package kadai;

public class loop2 {

	public static void main(String[] args) {
		
		loopOdd(10);
		
	}
	
	public static void loopOdd(int x) {
		for (int i = 1; i <= x; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
