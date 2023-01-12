package Pratice;

public class Associate {
	private int id,yearsOfExperience;
	private String name,dept;
	public Associate(int id, String name, String dept, int yearsOfExperience) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.yearsOfExperience = yearsOfExperience;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
