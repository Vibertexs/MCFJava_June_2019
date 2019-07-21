import java.util.Scanner;

public class ArrayTrainging {
	public static int ask(String inputMSG){
		System.out.print(inputMSG);
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		return x;
	}
	
	
	public static void main(String[] args) {
		int x = ask("How many numbers do you want add together: ");
		int [] arrayExample = new int [x];
		
		for(int i = 0; i<arrayExample.length;i++){
			String position = "";
			if (i==0){
				position = "st";
			}else if (i==1){
				position = "nd";
			}else if(i==2){
				position= "rd";
			}else{
				position = "th";
			}
			arrayExample[i] = ask("what is the "+(i+1)+position +" number: ");
			
		}
		
		System.out.println("You have entered: " +arrayExample.length+ " numbers");
		add(arrayExample);

	}
	public static void add(int[] myArray){
		int sum = 0;
		for(int i =0; i<myArray.length;i++){
			sum = sum +myArray[i];
		}
		System.out.println("All numbers together is " + sum);
	}

}
