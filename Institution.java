package Pratice;

public class Institution {
	private int institution;
	private String institutionName;
	private int noOfStudentsPlaced;
	private int noOfStudentsCleared;
	private String location;
	private String grade;
	public Institution(int institution, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared,
			String location) {
		this.institution = institution;
		this.institutionName = institutionName;
		this.noOfStudentsPlaced = noOfStudentsPlaced;
		this.noOfStudentsCleared = noOfStudentsCleared;
		this.location = location;
	}
	public int getInstitution() {
		return institution;
	}
	public void setInstitution(int institution) {
		this.institution = institution;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public int getNoOfStudentsPlaced() {
		return noOfStudentsPlaced;
	}
	public void setNoOfStudentsPlaced(int noOfStudentsPlaced) {
		this.noOfStudentsPlaced = noOfStudentsPlaced;
	}
	public int getNoOfStudentsCleared() {
		return noOfStudentsCleared;
	}
	public void setNoOfStudentsCleared(int noOfStudentsCleared) {
		this.noOfStudentsCleared = noOfStudentsCleared;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
