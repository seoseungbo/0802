
public class MethodDemo1 {
	public static void main(String[] args) {
		MethodDemo1 md = new MethodDemo1();
		System.out.println("Program is Starting...");
		md.makeSum(1, 100);
		md.makeSum(30, 50);
		System.out.println("Program is over...");
	}

	void makeSum(int start, int last) {  //Call by Value
		System.out.println("Method is Starting");
		int sum = 0;
		for (int i = start; i <= last; i++) {
			sum += i;
		}
		System.out.println(start + "부터" + last + "까지의 합은" + sum);
		System.out.println("Method is Over...");
	}
}