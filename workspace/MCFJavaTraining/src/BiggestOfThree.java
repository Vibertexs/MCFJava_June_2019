import java.util.Scanner;

public class BiggestOfThree {

	public static void main(String[] args) {

			System.out.println("Enter 3 integers Press ENTER KEY after typing each number: ");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();		
			int biggestNumber = biggest(a, b, c);
			System.out.println("The biggest number is " +biggestNumber);
		}
	public static int biggest(int a, int b, int c){
		int x = a;
		if(a>b){
			x=a; 
		}else if(a<b){
			x = b;
		}
		if (x>c){
			x= x;
		}else if(c>x){
			x= c;
		}
		return x;
	}

}
