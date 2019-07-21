package car.oops;
import java.util.*;
public class CarDataBase {
	public ArrayList<Car> listOfCars = new ArrayList<>();

	public ArrayList<Car> getListOfCars() {
		return listOfCars;
	}

	public void setListOfCars(ArrayList<Car> listOfCars) {
		this.listOfCars = listOfCars;
	}
	
//	This is to add a new car
	public void addNewCar(Car car){
		listOfCars.add(car);
	}
	
//	This finds the car by name
	public Car findCarByName(String name){
		for(Car car : listOfCars){
			String nameOfTheCar = car.getCarBrand();
			if(nameOfTheCar.contains(name)){
				return car;
			}
		}
		return null;
	}
//	This is to find the car by it's model
	public Car findCarByModel(String model){
		for(Car car : listOfCars){
			String modelOfTheCar = car.getCarModel();
			if(modelOfTheCar.contains(model)){
				return car;
			}
		}
		return null;
	}
//	This is to find the car by it's ID Number
	public Car findCarByIdNumber(Long number){
		for(Car car : listOfCars){
			Long numberOfTheCar = car.getIdNumber();
			if(numberOfTheCar == car.idNumber){
				
				return car;
			}
		}
		return null;
	}
	
	public void removeCar(long idNumber){
		Car car = findCarByIdNumber(idNumber);
		listOfCars.remove(car);
	}
	
	public void displayCarDetails(Car car){
		System.out.println("Brand: "+car.carBrand);
		System.out.println("Model: "+car.carModel);
		System.out.println("Type: "+car.carType);
		System.out.println("Color"+ car.color);
		System.out.println("Milage: "+car.milage);
		System.out.println("Damage: "+ car.damage);
		System.out.println("ID NUmber: "+car.idNumber);
	}

	

}



