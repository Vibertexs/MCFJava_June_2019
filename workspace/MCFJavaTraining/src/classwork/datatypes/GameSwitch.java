package classwork.datatypes;
import java.util.Scanner;

public class GameSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String intro = ("Press '1' for instructions\n"
				+ "Press '2' to resume game\n"
				+ "Press '3' to start new game\n"
				+ "Press '4' to exit the game");
		System.out.println(intro);
		int loops = 1;
		while(loops == 1){
			loops = 0;	
			String ans = scan.next();
			switch (ans) {
			case "1":
				System.out.println("Don't die");
				loops = 0;
				break;
			case "2":
				System.out.println("You have been banned for being \nafk for too long");
				break;
			case "3":
				System.out.println("You ran out of storage");
				break;
			case "4":
				System.out.println("Press 'Ctrl' + 'Z' ");
				break;
			default:
				System.out.println("Can you not read!\nPlease try again");
				loops = 0;
				break;
			}
		}

	}

}
