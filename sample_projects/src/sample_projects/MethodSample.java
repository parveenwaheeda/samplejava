package sample_projects;


public class MethodSample {

	public static void add() {
		int a = 90;
		int b = 80;
		System.out.println("Add results is : " + (a + b));
	}

	public void sub() {
		int a = 90;
		int b = 80;
		System.out.println("Sub results is : " + (a - b));
	}

	public static void main(String[] args) {
		add();
		System.out.println("Main method");
		//create an object/reference name for the class and call all methods and variables using the reference name 
		// CLASSNAME objectName = new CLASSNAME();
		MethodSample t = new MethodSample();
		t.sub();
		

	}

}
