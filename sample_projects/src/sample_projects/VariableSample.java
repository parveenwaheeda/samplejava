package sample_projects;


public class VariableSample {
	// Global Variables
	static int a = 120;
	static int b = 110;

	public static void add() {
		// Local Variables
		int a = 90;
		//int b = 80;
		System.out.println("Add results is : " + (a + b));

	}

	public static void sub() {
		// Local Variables
		//int a = 50;
		int b = 10;
		System.out.println("Sub results is : " + (a - b));
	}

	public static void main(String[] args) {
		add();
		sub();
	}

}
