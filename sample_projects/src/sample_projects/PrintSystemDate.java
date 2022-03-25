package sample_projects;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintSystemDate {

	public static void main(String[] args) {
		//CLASSNAME refereneceNAme = new CLASNAME();
		Date d =new Date();
		System.out.println(d);//Wed Mar 02 09:36:48 IST 2022
		
		//ddMMMyyyy_HHmmss
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		
		//convert the system date to userdefined format
		String timeStamp = df.format(d);
		System.out.println(timeStamp);

	}
}
