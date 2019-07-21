package classwork.datatypes;
import java.util.Scanner;
public class examplebythebestesttaNader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean yoG;
		yoG = true;
		while(true){
			//callFunct();
			System.out.println("Do you want to run again?input 0 ");
			Scanner s = new Scanner(System.in);
			int x = s.nextInt();
			if(x ==1 ){
				yoG = true;
			}else if(x== 0 ){
				yoG = false;
			}
			
		}
	}

}
