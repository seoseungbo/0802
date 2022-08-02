import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int [] array = {4,5,6,2,7,4,4,7,47,48,2}
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("After Ascending Sorting");
		System.out.println(Arrays.toString(array));
		
		System.out.println("After Descending Sorting");
		System.out.println("[");
		for(int i = array.length -1 ; i >=0 ; i++) {
			System.out.println(array[i] + ",");
		}
		System.out.println("]");
	}
}
