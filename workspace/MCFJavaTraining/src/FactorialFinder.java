import java.util.Scanner;

public class FactorialFinder {

	public static void main(String[] args) {
		System.out.println("How many rows do you want");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		x++;
		int t = 1;
		int sum = 1;
		for(int i=1; i<=x;i++){
			System.out.print(t);
			if(i<x){
				System.out.print("*");
				sum = sum *t;
				t ++;
			}
		}
		System.out.println();

		System.out.println("Factorial is "+ sum);


	}
}



