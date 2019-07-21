package classwork.datatypes;

import java.util.Scanner;

public class calculator {
	public static String ask(String inputMSG){
		System.out.println(inputMSG);
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		return x;

	}


	public static void main(String[] args) {

		String question = ("What is the first number that you would like to ");
		String question2 = ("What is the second number that you would like to ");
		String x = ask("Would you like to add, subtract, multiply, or divide 2 numbers");
		
		while (true){
			

			//This is where the class adds
			if(x.equalsIgnoreCase("add")){
				try{
					String number1 = ask(question+x);
					int realNumber1 = Integer.parseInt(number1);
					String number2 = ask(question2+x);
					int realNumber2 = Integer.parseInt(number2);
					add(realNumber1, realNumber2);
				}catch(Exception e) {
					System.out.println("Next time please insert a number");
					
				}

				//This is where the class subtract	
			} else if(x.equalsIgnoreCase("subtract")){
				try{
				String number1 = ask(question+x);
				int realNumber1 = Integer.parseInt(number1);
				String number2 = ask(question2+x);
				int realNumber2 = Integer.parseInt(number2);
				sub(realNumber1, realNumber2);			
				}catch(Exception e){
					System.out.println("Next time please insert a number");	
				}	

				//This is where the class multiply
			} else if(x.equalsIgnoreCase("multiply")){
				try{
				String number1 = ask(question+x);
				int realNumber1 = Integer.parseInt(number1);
				String number2 = ask(question2+x);
				int realNumber2 = Integer.parseInt(number2);
				multiply(realNumber1, realNumber2);	
				}catch(Exception e){
					System.out.println("Next time please insert a number");
				}

				//This is where the class divides
			}else if(x.equalsIgnoreCase("divide")){
				try{
				String number1 = ask(question+x);
				int realNumber1 = Integer.parseInt(number1);
				String number2 = ask(question2+x);
				int realNumber2 = Integer.parseInt(number2);
				divide(realNumber1, realNumber2);		
				}catch(Exception e){
					System.out.println("Next time please insert a number");
				}

				//This asks you to do it again when you failed the last time
			}else{
				x=ask("Please say add, subtract, multiply, or divide");
		

			}
		}

	}

	public static void add(int num1, int num2){
		int addValue = num1+ num2;

		System.out.println("Your answer is "+addValue);
	}
	public static void sub(int num1, int num2){
		int addValue = num1- num2;

		System.out.println("Your answer is "+addValue);
	}
	public static void multiply(int num1, int num2){
		int addValue = num1* num2;

		System.out.println("Your answer is "+addValue);
	}
	public static void divide(int num1, int num2){
		int addValue = num1/num2;

		System.out.println("Your answer is "+addValue);
	}
}
