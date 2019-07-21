package classwork.datatypes;

import java.util.Scanner;

public class age {
	

	public static void main(String[] args) {
		
		String inptage = ask("How old are you");
		int Age = Integer.parseInt(inptage);
		if(Age<2){
			System.out.println("You are a baby");
		}else if(Age>= 3 && 5>=Age){
			System.out.println("You are a toddler");
		}else if(Age>=6 && 12>= Age){
			System.out.println("You are a kid");
		}else if(Age >= 13 && 19>= Age){
			System.out.println("you are a teen");
		}else if (Age>= 20){
			System.out.println("Times ticking");
		}
	}
	public static String ask(String inputMSG){
		System.out.println(inputMSG);
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		return x;
	}

}
