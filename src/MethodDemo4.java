
public class MethodDemo4 {
	public static void main(String[] args) {
		//mymethod(5, 62.8, 'A', "Hello", "World");
//		//mymethod(new int[] {3,4,5,6,});
//		Student jimin = new Student();  jimin.name = "한지민"; jimin.age = 26;
//		mymethod(jimin);
//	}
//	static void mymethod(Student mystudent) { // CALL BY REFERANCE
//	//static void mymethod(int su, double weight, char grade, String str) {
	int original = 5;
	System.out.println("Before calling method, original = " + original);
	mymethod(original);
	System.out.println("After calling method, original = " + original);
		
	}
	static void mymethod(int target) { //int target = original
		System.out.println("In method, target = " + target);
		target = 100;
		System.out.println("In method, target = " + target);
	}
}
