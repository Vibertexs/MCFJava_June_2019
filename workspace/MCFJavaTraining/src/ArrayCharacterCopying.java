
public class ArrayCharacterCopying {

	public static void main(String[] args) {
		int [] elements = {0,10,20,30,40};
		for (int i = 0; i<elements.length;i++){
			elements[i]+= 5;
			System.out.print(elements[i]+" ");
		}
		System.out.println();
		for (int i = elements.length-1; i>=0;i--){
			
			System.out.print(elements[i]+" ");
		}
		char [] array1 = {'a','b','c','d'};
		char[] array2 = array1;
		int counter = 0;
		System.out.println(array2[1]);
		for (int i = 0;i<array1.length;i++){
			System.out.print(array1[i]);
			if(array1[i]=='a'){
				counter++;
			}
		}
		System.out.println("\nThere are "+ counter+" a");

	}

}
