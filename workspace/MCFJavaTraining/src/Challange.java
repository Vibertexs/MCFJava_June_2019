import java.util.Scanner;

public class Challange {

	public static int ask(String inputMSG){
		System.out.print(inputMSG);
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		return x;
	}
	
	public static void main(String[] args) {
	int a = ask("What is the first number");
	int b = ask("What is the second number");
	int c = ask("What is the third number");

	}

}
