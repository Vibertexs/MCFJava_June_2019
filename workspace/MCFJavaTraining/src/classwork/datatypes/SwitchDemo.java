package classwork.datatypes;
import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		String userEnterNumber = scan.next();
		switch (userEnterNumber) {
		case "1":
			System.out.println("your number was one");
			break;
		case "2": 
			System.out.println("your number is 2");

		default:
			System.out.println("hello1");
			break;
		}

	}

}
