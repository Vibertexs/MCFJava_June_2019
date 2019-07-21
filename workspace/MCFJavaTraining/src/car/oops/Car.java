package car.oops;

public class Car {
//	These are all the variables when looking into a car
	String carBrand;
	String carModel;
	Integer yearModel;
	Integer milage;
	Integer price;
	Boolean damage;
	String carType;
	String color;
	Long idNumber;
	

	public Car(){
		
	}
/*	This allows you to put all 
 * the information in at once while still having 
 * the ability to do it one at a time
 */
	public Car(String carBrand, String carModel, Integer yearModel,
			Integer milage, Integer price, Boolean damage, String carType, String color, Long idNumber){
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.yearModel = yearModel;
		this.milage = milage;
		this.price = price;
		this.damage = damage;
		this.carType = carType;
		this.color = color;
		this.idNumber = idNumber;
				
	}
	public Long getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(Long idNumber) {
		this.idNumber = idNumber;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public Integer getYearModel() {
		return yearModel;
	}
	public void setYearModel(Integer yearModel) {
		this.yearModel = yearModel;
	}
	public Integer getMilage() {
		return milage;
	}
	public void setMilage(Integer milage) {
		this.milage = milage;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Boolean getDamage() {
		return damage;
	}
	public void setDamage(Boolean damage) {
		this.damage = damage;
	}

}
