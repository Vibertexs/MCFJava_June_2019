package developer.management;
import java.util.*;
public class DeveloperManagementSystem {

	public static void main(String[] args) {
		DeveloperDataBase devDB = new DeveloperDataBase();
		while(true){
			
			System.out.println("Select one of the following option");
			System.out.println("1.Add new developer\n");
			System.out.println("2.Find Developer by name\n");
			System.out.println("3.Find Developers by skill\n");
			System.out.println("9.Exit");
			
			Scanner scr = new Scanner(System.in);
			int userOption = scr.nextInt();
			
			switch(userOption){
			case 1:
				Developer d1 = new Developer();
				System.out.println("Enter Name for the developer:");				
				d1.setName(scr.next());
				System.out.println("Enter City of the Developer: ");
				d1.setCity(scr.next());
				System.out.println("Enter Zip of the Developer: ");
				d1.setZip(scr.nextInt());
				System.out.println("Enter Skill of the Developer: ");
				d1.setCity(scr.next());
				System.out.println("Enter current salary of the Developer: ");
				d1.setCurrentSallery(scr.nextFloat());
				break;
			case 2:
				System.out.println("Enter the name of the developer to Find (Case Sensitive):");
				String name = scr.next();
				Developer deeveloper = devDB.findDeveloperByName(name);
				devDB.displayDeveloperDetails(deeveloper);
				break;
				
			case 3:
				
				System.out.println("Enter a Skill");
				String skill = scr.next();
				ArrayList<Developer> developers = devDB.findDevelopersBySkill(skill);
				Developer developer = devDB.findDeveloperByName(skill);
				devDB.displayDeveloperDetails(developer);
				break;
				
			case 9:
				break;
			
			
			default:
				System.out.println("You have entered an invalid number");
				break;
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Developer d1 = new Developer();
//		d1.setName("Abdul Vale");
//		d1.setCity("Folsom");
//		d1.setZip(95630);
//		d1.setState("CA");
//		d1.setIsAvilible(false);
//		d1.setCurrentSallery(100000f);
//		d1.setRequiredSalary(1000000f);
//		d1.setIsWillingToRelocate(false);
//		d1.setIsWillingToTravel(false);
//		d1.setSkill("Java");
//		
////		Developer d2 = new Developer("Bilal Khan", "Folsom", "CA", 95630, "Python",false, 0f, 100000f, true, false);
//		
//		
//		devDB.addNewDeveloper(d1);
//		Developer foundByNameDev = devDB.findDeveloperByName("Abdul");
//		System.out.println(foundByNameDev.getSkill());
//		
//		ArrayList<Developer> javaDevelopers = devDB.findDevelopersBySkill("Java");
//		System.out.println(javaDevelopers);
//		for (Developer developer : javaDevelopers){
//			System.out.println("Name: "+developer.getName());
//			System.out.println("City: "+developer.getCity());
//			System.out.println("Skill: "+developer.getSkill());
//			System.out.println("Name: "+developer.getName());
//			System.out.println("Name: "+developer.getName());
//			System.out.println("Name: "+developer.getName());
//			System.out.println("Name: "+developer.getName());
//			System.out.println("Name: "+developer.getName());
				
		}
		
			
		

	}

//}
