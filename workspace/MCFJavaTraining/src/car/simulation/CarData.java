package car.simulation;

public class CarData {
	
	String carName;
	
	int carYearModel;
	int distanceTraveled;
	
	public void __init__(String carName, int carYearModel, int distanceTraveled){
		this.carName = carName;
		this.carYearModel = carYearModel;
		this.distanceTraveled = distanceTraveled;
	}	


	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarYearModel() {
		return carYearModel;
	}

	public void setCarYearModel(int carYearModel) {
		this.carYearModel = carYearModel;
	}

	public int getDistanceTraveled() {
		return distanceTraveled;
	}

	public void setDistanceTraveled(int distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}


}
