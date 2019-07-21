import java.util.Scanner;

public class monthExcersice {

	public static void main(String[] args) {


		float effective = 100;

		int months = 0;
//		while(50 <= effective){
// X
////j
////			months++;
//
//		}
		int moment = 0;
		for (int moths= 0; 50<=effective;moths++){
			System.out.println("Months: " +moths+" Effective: "+ effective);
			effective = (effective*0.96f);		
			moment = moths;
		}
		System.out.println("It will expire in "+moment+" months");

	}

}
