package car.oops;

import java.util.Scanner;

import developer.management.DeveloperDataBase;

public class CarManegementSystem {
	public static void main(String[] args) {
		CarDataBase carDB = new CarDataBase();
		Car car1 = new Car("Acura", "TSX", 2006, 20, 10000, false, "Sudan", "Black", 1234567890L);
		System.out.println(car1.getDamage());
		carDB.displayCarDetails(car1);
		carDB.listOfCars.add(car1);
		int i = 0;
		while(i == 0){
			
			System.out.println("Select one of the following option");
			System.out.println("1.Add new car\n");
			System.out.println("2.Find car by name\n");
			System.out.println("3.Find car by ID Number\n");
			System.out.println("9.Exit");
			Scanner scr = new Scanner(System.in);
			int userOption = scr.nextInt();
				
			switch (userOption) {
			case 1:
				System.out.println("Enter car Brand");
				car1.setCarBrand(scr.next());
				System.out.println("Enter car model");
				car1.setCarModel(scr.next());
				System.out.println("Enter car year model");
				car1.setYearModel(scr.nextInt());
				System.out.println("Enter car milage");
				car1.setMilage(scr.nextInt());
				System.out.println("Enter car price");
				car1.setPrice(scr.nextInt());
				System.out.println("Is there any damage");
				car1.setDamage(scr.hasNextBoolean());
				System.out.println("Enter car type");
				car1.setCarType(scr.next());
				System.out.println("Enter car color");
				car1.setColor(scr.next());
				System.out.println("Enter car ID Number");
				car1.setIdNumber(scr.nextLong());
				break;
			case 2:
				System.out.println(carDB.findCarByIdNumber(scr.nextLong()));
			default:
				
				break;
			}
		
		}
	}
}