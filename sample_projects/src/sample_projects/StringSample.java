package sample_projects;

public class StringSample {
	public static void main(String[] args) {
		String g; // String declaration
		g = "Ravi"; // Assign the String value to a variable

		String h = " Teja ";

		System.out.println(g);

		System.out.println(h);
		// remove space in front/back of String
		System.out.println(h.trim());

		// Concatenation of Strings
		String i = g + h;
		System.out.println(i);
		System.out.println(g + " " + h);

		System.out.println(i.toUpperCase());
		System.out.println(i.toLowerCase());

		String j = "Apple";
		String k = "apPLe";
		// Length: always start from 1(one) onwards
		System.out.println(j.length());
		// Index: always start from 0(zero) onwards
		System.out.println(k.charAt(3));

		if (j.equals(k)) {
			System.out.println("Both are  equal");

		} else {
			System.out.println("Both are not equal");
		}
		System.out.println("####################################");
		if (j.equalsIgnoreCase(h)) {
			System.out.println("Both are  equal********");

		} else {
			System.out.println("Both are not equal********");
		}

	}

}
