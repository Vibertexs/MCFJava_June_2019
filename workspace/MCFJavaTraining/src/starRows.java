import java.util.Scanner;

public class starRows {

	public static void main(String[] args) {
		System.out.println("How many rows do you want");
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		int x1 = Integer.parseInt(x);

		int loops = 0;
		while(loops != x1){
			loops++;
			for(int i = 0; i<loops; i++){
				System.out.print(i);
			}
			System.out.println("\\");
			for(int i = 0; i<loops; i++){
				System.out.print("");
			}
		}
	}
}