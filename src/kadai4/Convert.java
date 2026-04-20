package kadai4;

public class Convert {

	public static void reverse(int input) {
		String reversed = new StringBuilder(String.valueOf(input)).reverse().toString();
		System.out.println(reversed);
	}
	
	public static void reverse(double input) {
		String reversed = new StringBuilder(String.valueOf(input)).reverse().toString();
		System.out.println(reversed);
	}
	
	public static void reverse(String input) {
		String reversed = new StringBuilder(input).reverse().toString();
		System.out.println(reversed);
	}
}
