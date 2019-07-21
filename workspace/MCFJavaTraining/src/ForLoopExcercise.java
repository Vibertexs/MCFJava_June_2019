public class ForLoopExcercise {

	public static void main(String[] args) {

		int loops = 0;
		while(loops != 5){
			loops++;
			for(int i = 0; i<loops; i++){
				System.out.print(i);
			}
			System.out.println();
		}
	int t = 1;
	int sum = 0;
	for(int i=1; i<=5;i++){
		System.out.print(t);
		if(i<5){
			System.out.print("+");
			sum = sum+t;
			t = (t*10)+1;
		}
	}
	System.out.println();
	
	System.out.println("Sum is"+ sum);
	
	
	}
	
}
