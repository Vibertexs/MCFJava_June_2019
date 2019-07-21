import java.util.Scanner;
public class Octubus {

	public static void main(String[] args) {
		System.out.println("Please enter anythin");
		Scanner s = new Scanner(System.in);
		String x = s.next();
		
		for(int i = 0;i<x.length();i++){
			System.out.println(x.charAt(i));
		}

	}

}
