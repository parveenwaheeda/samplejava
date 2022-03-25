package sample_projects;


public class DataTypeSample {

	public static void main(String[] args) {
		byte a = 17;// -128 to 127
		short b = 80;
		int f = 343;
		long r = 3434;
		// long mobilen = 9985558912;

		double ab = 90.123456789;
		float abc = 3424.123456789f;
		System.out.println(ab);
		System.out.println(abc);

		// CHAR: to store a single alphabet/number into a variable
		char abcd = 'r';
		char nvd = '3';
		// BOOLEAN: to store TRUE or FALSE into a variable
		boolean an = true;
		boolean anf = false;

		System.out.println("******************************************");
		
		String g; // String declaration
		g = "Ravi"; // Assign the String value to a variable

		String h = " Teja ";

		System.out.println(g);
		
		System.out.println(h);
		//remove space in front/back of String 
		System.out.println(h.trim());
		
		
		//Concatenation of Strings
		String i = g+h;
		System.out.println(i);
		System.out.println(g+" "+h);
		
		
		System.out.println(i.toUpperCase());
		System.out.println(i.toLowerCase());
		
		
		
		
		
		

	}

}
