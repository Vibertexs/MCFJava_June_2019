package classwork.datatypes;

import java.util.Scanner;

public class TemperatureConverter {
		public static String ask(String inputMSG){
			System.out.println(inputMSG);
			Scanner scan = new Scanner(System.in);
			String x = scan.next();
			return x;
		}

		public static float convertToFahrenheight(float value){
			float C = (value*(9/5))+32;
			return C;
		}
		public static float convertToCelsius(float value){
			float C = (value-32)*5 / 9;
			return C;
		}


		//THIS IS THE MAIN METHODS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
		public static void main(String[] args) {

			int loops = 0;
			while (loops == 0){
				loops = 1;
				Scanner scan = new Scanner(System.in);
				String x = ask("Would you like to convert into fahrenheight or celsius");
				if(x.equalsIgnoreCase("fahrenheight")){
					try{
						String value = ask("What is the celsius");
						float answer = Float.parseFloat(value);
						float answerReal = convertToFahrenheight(answer);
						System.out.println(value  + " degrees fahrenheight is "+ answerReal+ " celsius");
						String again = ask("Would you like to run this class again");
						while (true){
							if (again.equalsIgnoreCase("yes")){
								loops = 0;
								break;

							}else if (again.equalsIgnoreCase("no")){
								System.out.println("Thank you for using this class");
								loops = 1;
								break;
							}else{
								System.out.println("Please say yes or no");
								break;
							}
						}

					}catch (Exception e){
						System.out.println("Please enter in a real number");
						loops = 0;
					}
				}else if(x.equalsIgnoreCase("celsius")){
					try{
						String value = ask("What is the fahrenheight");
						float answer = Float.parseFloat(value);
						float answerReal = convertToCelsius(answer);
						System.out.println(value  + " degrees celsius is "+ answerReal+ " fahrenheight");
						String again = ask("Would you like to run this class again");
						while (true){
							if (again.equalsIgnoreCase("yes")){
								loops = 0;
								break;
							}else if (again.equalsIgnoreCase("no")){
								System.out.println("Thank you for using this class");
								loops = 1;
								break;
							}else{
								System.out.println("Please say yes or no");

							}
						}


					}catch (Exception e){
						System.out.println("Please enter in a real number");
					}
				}else{
					System.out.println("Please say fahrenheight or celsius");
					loops = 0;
				}	
			}
		}

	}
