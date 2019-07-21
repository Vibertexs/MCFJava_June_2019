package classwork.datatypes;

import java.util.Scanner; 
public class AverageRainFall{


	public static String GetInput(String input){
		System.out.println(input);
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		return x;
	}	

	public static int convert(String Input){
		int x= Integer.parseInt(Input);
		return x;
	}

	public static int allTogether(String Input){
		String returningValue = GetInput(Input);
		int finalvalue = convert(returningValue);

		return finalvalue;
	}


	public static void main(String[]args){


		int value = allTogether("How many months do you want to \naverage the rainfall of?");


		int [] yo_g;	
		yo_g = new int [value];


		int i = 0;
		while(i < yo_g.length){
			int l = i+1;
			System.out.println("How many inches in Month: "+ l);
			Scanner scaning = new Scanner(System.in);
			String f = scaning.next();
			int fNUM= Integer.parseInt(f);
			yo_g[i] = fNUM;
			i++;
			
		}
		System.out.println("ok that is all the values");
		int addingAll = 0;
		for(int h=0; h<yo_g.length;h++)
			addingAll =  addingAll + yo_g[h];
		System.out.println(addingAll+ " is all the values added");

		System.out.println(yo_g.length+ " Is the amount of months");
//		int dividingAll = addingAll / yo_g.length;
		int divider = yo_g.length;
		System.out.println("So that means that "+addingAll / divider+" is the average rainfall");
	}
}


//			yo_g[i] = 1;

//		for(int f=0; i<;i++);




//		
//		int i, a;
//		int array[] = new int[5];
//		for(i=0; i<array.length;i++)
//			System.out.println("your integer, input 5 one at a time");
//
//		for(int x = array.length - 1; x >=0; i--);
//		System.out.println("Your array reversede:" + i);
//
//	}
//}
//

//sudo code:
/*make a for or a while loop that runs the amount of months you wanted it to
 * it gets input from the user and adds it onto a list
 * add the end it get all of the values in the array of integers and divides them
 */
