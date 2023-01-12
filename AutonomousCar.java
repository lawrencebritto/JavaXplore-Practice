package Pratice;

public class AutonomousCar {

	private int id;
	private String brand;
	private int noOfTestConducted;
	private int noOfTestPassed;
	private String environment;
	private String grade;
	public AutonomousCar(int id, String brand, int noOfTestConducted, int noOfTestPassed, String environment) {
		super();
		this.id = id;
		this.brand = brand;
		this.noOfTestConducted = noOfTestConducted;
		this.noOfTestPassed = noOfTestPassed;
		this.environment = environment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getNoOfTestConducted() {
		return noOfTestConducted;
	}
	public void setNoOfTestConducted(int noOfTestConducted) {
		this.noOfTestConducted = noOfTestConducted;
	}
	public int getNoOfTestPassed() {
		return noOfTestPassed;
	}
	public void setNoOfTestPassed(int noOfTestPassed) {
		this.noOfTestPassed = noOfTestPassed;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
