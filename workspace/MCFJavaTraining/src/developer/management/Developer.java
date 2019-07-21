package developer.management;

public class Developer {
	
	private String name;
	private String city;
	private String State;
	private Integer zip;
	private String skill;
	private Boolean isAvilible;
	private Float currentSallery;
	private Float requiredSalary;
	private Boolean isWillingToRelocate;
	private Boolean isWillingToTravel;
	public Developer(){
		
	}
	
	public Developer(String name, String city, String state,  int zip, String skill, boolean isAvaliable,
			Float currentSalary, Float requiredSalary, Boolean isWillingToRelocate, Boolean isWillingToTravel){
		
		this.name= name;
		this.city = city;
		this.State = state;
		this.zip = zip;
		this.skill = skill;
		this.isAvilible = isAvaliable;
		this.currentSallery = currentSalary;
		this.requiredSalary = requiredSalary;
		this.isWillingToRelocate = isWillingToRelocate;
		this.isWillingToTravel = isWillingToTravel;
		
	}
	
	
	
	public Float getCurrentSalary(){
		
		return currentSallery;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Boolean getIsAvilible() {
		return isAvilible;
	}

	public void setIsAvilible(Boolean isAvilible) {
		this.isAvilible = isAvilible;
	}

	public Float getCurrentSallery() {
		return currentSallery;
	}

	public void setCurrentSallery(Float currentSallery) {
		this.currentSallery = currentSallery;
	}

	public Float getRequiredSalary() {
		return requiredSalary;
	}

	public void setRequiredSalary(Float requiredSalary) {
		this.requiredSalary = requiredSalary;
	}

	public Boolean getIsWillingToRelocate() {
		return isWillingToRelocate;
	}

	public void setIsWillingToRelocate(Boolean isWillingToRelocate) {
		this.isWillingToRelocate = isWillingToRelocate;
	}

	public Boolean getIsWillingToTravel() {
		return isWillingToTravel;
	}

	public void setIsWillingToTravel(Boolean isWillingToTravel) {
		this.isWillingToTravel = isWillingToTravel;
	}
	

}
