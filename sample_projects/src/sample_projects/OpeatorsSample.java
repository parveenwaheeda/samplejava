package sample_projects;


public class OpeatorsSample {

	public static void main(String[] args) {
		int a = 90;
		int b = 80;
		int c = 110;

		if (a > b || b > c) {
			System.out.println(" if blcok has executed");
		}else {
			System.out.println(" else blcok has executed");

		}

		if (a > b && c > b) {
			System.out.println(" if blcok has executed***");

		}else {
			System.out.println(" else blcok has executed***");

		}
	}

}
