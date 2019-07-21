package developer.management;

import java.util.ArrayList;

public class DeveloperDataBase {

	public ArrayList<Developer> listOfDevelopers = new ArrayList<>();

	public ArrayList<Developer> getListOfDevelopers() {
		return listOfDevelopers;
	}

	public void setListOfDevelopers(ArrayList<Developer> listOfDevelopers) {
		this.listOfDevelopers = listOfDevelopers;
	}

	public void addNewDeveloper(Developer dev){
		listOfDevelopers.add(dev);
	}

	public Developer findDeveloperByName(String name){

		for (Developer developer : listOfDevelopers) {
			String nameOfTheDeveloper = developer.getName();
			if(nameOfTheDeveloper.contains(name)){
				return developer;
			}
		}
		return null;
	}

	public Developer findDeveloperByZip(int zip){

		for (Developer developer : listOfDevelopers) {
			int  zipOfDeveloper = developer.getZip();
			if(zipOfDeveloper == zip){
				return developer;
			}
		}
		return null;
	}
	
	public Developer findDeveloper(String name, int zip, String skill){
		for (Developer developer : listOfDevelopers) {
			 String nameOfTheDeveloper = developer.getName();
			 int zipOfTheDeveloper = developer.getZip();
			 String skillOfTheDeveloper = developer.getSkill();
			 if(nameOfTheDeveloper.contains(name) ||
					 zipOfTheDeveloper == zip ||
					 skillOfTheDeveloper.contains(skill)){
				 return developer;
			 }
			 
		}
		return null;
	}
	
	public int sizeOfDevDataBase(){
		return listOfDevelopers.size();
	}

	
	public ArrayList<Developer> findDevelopersBySkill(String skill) {
		ArrayList <Developer>developerMatchingSkills = new ArrayList<>();
		
		for (Developer developer : listOfDevelopers) {
			if(developer.getSkill().equals(skill)){
				developerMatchingSkills.add(developer);
			}
		}
		
		return developerMatchingSkills;
	}

	
	public void removeDeveloper(String name) {
		Developer developer = findDeveloperByName(name);
		listOfDevelopers.remove(developer);
		
	}
	
	public void displayDeveloperDetails(ArrayList<Developer> developers){
		for(Developer developer: developers){
			System.out.println("Name: "+ developer.getName());
			System.out.println("City: "+ developer.getCity());
			System.out.println("State: "+ developer.getState());
			System.out.println("Zip: "+ developer.getZip());
			System.out.println("Skill: "+ developer.getSkill());
			System.out.println("Current Salary: "+ developer.getCurrentSalary());
			System.out.println("Willing to Relocate: "+ (developer.getIsWillingToRelocate()?"Yes":"No"));
		}
	}
	
	public void displayDeveloperDetails(Developer developer){	 
			System.out.println("Name: "+ developer.getName());
			System.out.println("City: "+ developer.getCity());
			System.out.println("State: "+ developer.getState());
			System.out.println("Zip: "+ developer.getZip());
			System.out.println("Skill: "+ developer.getSkill());
			System.out.println("Current Salary: "+ developer.getCurrentSalary());
			System.out.println("Willing to Relocate: "+ (developer.getIsWillingToRelocate()?"Yes":"No"));		 
	}
	
	



}

//package developer.management;
//import java.util.*;
//public class DeveloperDataBase {
//	
//	
//	
//	public ArrayList<Developer> listOfDeveloper= new ArrayList();
//	
//	public ArrayList<Developer> getListOfDevelopers(){
//		return listOfDeveloper;
//	}
//	
//	public ArrayList<Developer> getListOfDeveloper() {
//		return listOfDeveloper;
//	}
//
//	public void setListOfDeveloper(ArrayList<Developer> listOfDeveloper) {
//		this.listOfDeveloper = listOfDeveloper;
//	}
//	public void addNewDeveloper(Developer dev){
//		listOfDeveloper.add(dev);
//	}
//	public Developer findDeveloperByName(String name){
//		
//		for(Developer developer: listOfDeveloper){
//			String nameOfTheDeveloper = developer.getName();
//			if (nameOfTheDeveloper.contains(name)){
//				return developer;
//			}
//		}
//		return null;
//	}
//
//	public Developer findDeveloperByZip(int zip){
//		for(Developer developer: listOfDeveloper){
//			int zipOfTheDeveloper = developer.getZip();
//			if (zipOfTheDeveloper==(zip)){
//				return developer;
//			}
//		}
//		return null;
//	}
//	
//	public Developer findDeveloper(String name, int zip, String skill){
//		
//		
//		for (Developer developer : listOfDeveloper){
//			String nameOfTheDeveloper = developer.getName();
//			int zipOfTheDeveloper  = developer.getZip();
//			String skillOfTheDeveloper = developer.getSkill();
//			if(nameOfTheDeveloper.contains(name)||
//				zipOfTheDeveloper == zip||
//				skillOfTheDeveloper.contains(skill)){
//				return developer;	
//			}
//			
//		}
//		return null;
//	}
//	public int sizeOfDevDataBase(){
//		return listOfDeveloper.size();
//		
//	}
//	
//	public ArrayList<Developer> findDevelopersBySkill(String skill){
//		ArrayList <Developer>developerMatchingSkills = new ArrayList<>();
//		
//		for (Developer developer : listOfDeveloper){
//			if (developer.getSkill().equals(skill)){
//				developerMatchingSkills.add(developer);
//			}
//		}
//		return developerMatchingSkills;
//	}
//
//
//	
//	public void removeDeveloper(String name){
//		Developer developer = findDeveloperByName(name);
//		listOfDeveloper.remove(developer);
//	}
//
//	
//
////	public void displayDeveloperDetails(ArrayList<Developer> developers){
////		for(Developer developer: developers){
////			System.out.println("Name: "+ developer.getName());
////			System.out.println("City: "+ developer.getCity());
////			System.out.println("State: "+ developer.getState());
////			System.out.println("Zip: "+ developer.getZip());
////			System.out.println("Skill: "+ developer.getSkill());
////			System.out.println("Current Salary: "+ developer.getCurrentSalary());
////			System.out.println("Willing to Relocate: "+ (developer.getIsWillingToRelocate()?"Yes":"No"));
////		}
////	}
//	
//	public void displayDeveloperDetails(Developer developer){	 
//			System.out.println("Name: "+ developer.getName());
//			System.out.println("City: "+ developer.getCity());
//			System.out.println("State: "+ developer.getState());
//			System.out.println("Zip: "+ developer.getZip());
//			System.out.println("Skill: "+ developer.getSkill());
//			System.out.println("Current Salary: "+ developer.getCurrentSalary());
//			System.out.println("Willing to Relocate: "+ (developer.getIsWillingToRelocate()?"Yes":"No"));		 
//	}
//	
//	
//
//
//}
//
//
//
//
