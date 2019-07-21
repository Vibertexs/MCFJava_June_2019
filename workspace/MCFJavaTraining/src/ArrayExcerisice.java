import java.util.Scanner;

public class ArrayExcerisice {
	public static void stepOne(){
		char [] array1 = {'a','b','c','d','2', 'g', 'A', 'a', '5'};
		char[] array2 = array1;
		int counter = 0;
		for (int i = 0;i<array1.length;i++){

			if(array1[i]=='a'){
				counter++;
			}
		}
		System.out.println("There are "+ counter+" a");
	}

	public static void StepTwo(){
		int sum = 0;
		int [] arrayOfNubers = {6,5,7,4,2};
		for (int i = 0;i < arrayOfNubers.length; i++){
			sum+= arrayOfNubers[i];
		}
		System.out.println("The sum of all the numbers combined is: "+sum);
	}
	public static void StepThree(){
		int sum = 0;
		int [] arrayOfNubers = {6,5,7,4,2};
		for (int i = 0;i < arrayOfNubers.length; i++){
			sum+= arrayOfNubers[i];
		}
		sum = sum/arrayOfNubers.length;
		System.out.println("The average of all the numbers is: "+sum);
	}


	public static void StepFour(){
		//The number that you are trtying ot find is lostChar
		char lostChar = 'a';
		char [] arrayOfNumbers = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
				'o','p','q','r','s','t','u','v','w','x','y','z'};
		System.out.println(arrayOfNumbers[7]);
		int index = 0;
		for (int i = 0;i < arrayOfNumbers.length; i++){
			if (arrayOfNumbers[i]==lostChar){
				index = i+1;	
			}
		}	
		System.out.println("The letter " + lostChar+ " is the "+ index+ " letter in the alaphabet");
	}
	/**
	 * 
	 */
	/**
	 * 
	 */
	public static void StepFive() {
		int[] a = {33,88,7,88,5564, 875, 92, 3, 0 , 3};
		int []c = a;
		int b= a.length;
		boolean sorted = true;
		int temp;
		while(sorted) {
			sorted = false;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					sorted = true;
				}
				
			}
			/*
			 * This is to read backwards
			 * find the index of the last number - the initial length of a
			 * make the loop run the inital length of a
			 * and print it
			 */
			
			for(int i =0; i<a.length;i++){
				System.out.print(a[i]);
				
			}
			System.out.println();
			}
		
		System.out.println("The sorted version of it is:" );
		for(int i =0; i<a.length;i++){
			System.out.print(a[i]);
			System.out.print(", ");
		}
		
	}

public static void main(String[] args) {
	
//	stepOne();
//	StepTwo();
//	StepThree();
//	StepFour();
	StepFive();
}



}
