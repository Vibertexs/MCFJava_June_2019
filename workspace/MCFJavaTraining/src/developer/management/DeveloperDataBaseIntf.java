//package developer.management;
//import java.util.*;
//public interface DevloperDatabaseIntf {
//	
//	public void addNewDeveloper(Developer developer);
//	public Developer findDeveloperByName (String nameOfTheDeveloper);
//	public Developer findDeveloperByZip(int zip);
//	public Developer findDeveloper(String name, int zip, String skill);
//	public int sizeOfDevDataBase();
//	public ArrayList<Developer> findDevelopersBySkill(String skill);
//	public void removeDeveloper(String name);
//	
//}





package developer.management;
import java.util.*;
public interface DeveloperDataBaseIntf {

	public ArrayList<Developer> findDeveloperBySkill(String skill);
	public void addNewDeveloper(Developer developer);
	public Developer findDeveloperByZip(int zip);
	public Developer findDeveloper(String name, int zip, String skill);
	public int sizeOfDevDataBase();
	public ArrayList<Developer> findDevelopersBySkill(String skill);
	public void removeDeveloper(String name);
}
