package kadai2;

public class IntegerArray2 {

	public static void main(String[] args) {
		
		loop(populateArray());
		
		
	}
	
	public static int[] populateArray() {
		int populatedArray[] = {1,7,2,7,3} ;
		return populatedArray;
	}
	
	public static void loop(int arr[]) {
		for (int element : arr) {
				System.out.println(element);
		}
	}
}
