package kadai;

public class IntegerArray3 {

	public static void main(String[] args) {
		loop(populateArray());	
	}
	
	public static int[] populateArray() {
		int populatedArray[] = {1,7,2,7,3} ;
		return populatedArray;
	}
	
	public static void loop(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==7) {
				count++;
			}
		}
		System.out.println(count+"個ありました。");
	}
}
