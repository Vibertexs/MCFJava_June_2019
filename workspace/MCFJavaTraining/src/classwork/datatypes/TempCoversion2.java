package classwork.datatypes;

import java.util.Scanner;
public class TempCoversion2 {

	public static void main(String[] args) {
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("press 1 to covert into Celsius");
		System.out.println("press 2 to covnert to Fahrenheit");
		String ans = scan.next();
		switch (ans) {
		case "1":
			System.out.println("What is the Fahrenheit");
			ans = scan.next();
			temp= Integer.parseInt(ans);
			temp = (temp-32)*5/9;
			System.out.println("It is "+ temp);			
			break;
		case "2":
			System.out.println("What is the Celsius");
			ans = scan.next();
			temp= Integer.parseInt(ans);
			temp = (temp*9/5)+32;
			System.out.println("It is "+ temp);
			
			break;
		default:
			
			break;
		}
		
	}

}
