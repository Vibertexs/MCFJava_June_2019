package classwork.datatypes;

import java.util.Scanner; 

public class physicsFormula {

	public static String ReadInput(String inputMSG)
	{
		System.out.println(inputMSG);	
		Scanner scan= new Scanner(System.in);
		String x = scan.next();
		return x;
	}

	public static void main(String[] args) {
		int loops = 0;
		String time;
		String velocity;
		String distance;
		
		System.out.println("This class is used to find the velocity, distance, or time");
		System.out.println("What are you tring to find");
		String missingValue = ReadInput("Please enter 'velocity', 'distance' or 'time");
		
		while (loops == 0){
			
			loops = 1;
			//This if statement finds the velocity when given distance and time	
			if (missingValue.equalsIgnoreCase("velocity")){

				time = ReadInput("What is the time");
				distance = ReadInput("what is the distance");
				float timeNum = Integer.parseInt(time);
				float distanceNum = Integer.parseInt(distance);
				float velocityNum =  distanceNum / timeNum;
				System.out.println("The velocity is "+ velocityNum+ " m/s");
				
			//This else if statement finds distance when given velocity and time
			}else if (missingValue.equalsIgnoreCase("distance")){

				velocity = ReadInput("What is the velocity");
				time = ReadInput("what is the time");
				float timeNum = Integer.parseInt(time);
				float velocityNum = Integer.parseInt(velocity);
				float distanceNum = velocityNum / timeNum;
				System.out.println("The distance is "+ distanceNum+ " meters");
				
			//This else if finds the time when the velocity and distance is given				
			}else if (missingValue.equalsIgnoreCase("time")){

				velocity = ReadInput("What is the velocity");
				distance = ReadInput("what is the distance");
				float velocityNum = Integer.parseInt(velocity);
				float distanceNum = Integer.parseInt(distance);	
				float timeNum = velocityNum / distanceNum;
				System.out.println("The time is "+ timeNum+ "seconds");
				
			//Asks you to enter a programmed word for it to solve
			}else{

				missingValue = ReadInput("Please enter 'velocity', 'distance' or 'time");
				loops = 0;					
			}
		}
	}
}

