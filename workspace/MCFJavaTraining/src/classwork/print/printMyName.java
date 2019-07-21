package classwork.print;

import java.util.Scanner; 

/*
 * This entire program asks for your name and prints it out at the end
 * In order to use this press control + s
 * Then press alt+shift+x then release and press j
 * Then follow the instructions it gives you
 */

public class printMyName {
	static String firstName = "";
	static String lastName = "";
	static String middleName = "";
	public static String ReadInput(String inputMSG, String outMSG)
	{
		System.out.println(inputMSG);
		Scanner scan= new Scanner(System.in);
		String x = scan.next();
		System.out.println(outMSG + " " + x);
		return x;
	}
	public static void main(String[] args) {

		int times = 0;
		//Asks for your first name
		firstName = ReadInput("What is your first name", "Your first name is ");

		while(times == 0){
			times = 1;
			//Asks if you have a middle name
			System.out.println("Do you have a middle name");
			Scanner ask = new Scanner(System.in);
			String answer = ask.next();

			if (answer.equalsIgnoreCase("no")){

				String ansMiddleName = answer;
				System.out.println("You don't have a middle name");

			}	else if(answer.equalsIgnoreCase("yes")){

				System.out.println("Ok then, what is your middle name");
				Scanner r= new Scanner(System.in);
				middleName = r.next();
				System.out.println("Okey then, your middle name is "+ middleName );
			}	else{

				System.out.println("Plz say yes or no");
				times = 0;
			}
		}
		// This code below asks for your last name
		lastName = ReadInput("What is your last name", "Your last name is ");
		// Combines the entire name
		System.out.println("Your entire name is " + (firstName) + " "+ (middleName) + " "+(lastName));

	}

}

