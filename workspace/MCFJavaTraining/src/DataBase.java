import java.util.Scanner;
import java.util.*;
public class DataBase {

	public static void main(String[] args) {

		ArrayList<String> database= new ArrayList<String>();
		database.add("Abdul Vali, Folsom, CA 95630" );
		database.add("Azaad, Rancho Cordova, CA 65666" );
		database.add("Rehman, Atlanta, GA 34567");
		database.add("Nader Opeyany, Folsom, CA");
		database.add("John Smith, Columbus, OH");
		database.add("Nader is the best your welcome you ingrate");



		ArrayList<Integer> locations = new ArrayList<Integer>();
		ArrayList<String> locationsOriginal = new ArrayList<String>();

		System.out.println(database.size());
		int found = 0;
		System.out.println("Please enter their first name");
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		int locationsCounter = 0;




		for (String string : database) {
			if(string.contains(x)){
				System.out.println("Found!!!");
			}else{
				System.out.println("Checking...");
			}
			
		}
		
		
//		for(int i = 0;i<database.size();i++){
//			if(database[i].contains(x)){
//				//				System.out.println(database[i]);
//				//				System.out.println("They have been found");
//				System.out.println("Found!!!");
//				locations.add(i);
//				locationsOriginal.add(database[i]);
//
//				//				++locationsCounter;
//				found++;
//
//
//			}else{
//				System.out.println("Checking...");
//			}
//
//		}
		//		//This and the one right below are the same thing
		//		System.out.println(found +" have been found");
		//		for(int i = 0;i<locations.size();i++){
		//			System.out.println(database[locations.get(i)]);
		//		}
		//This is the same thing as the one above
		for(Object object: locationsOriginal){
			System.out.println(object);
		}



		Float h = new Float(6);
		System.out.println(h);


	}}
