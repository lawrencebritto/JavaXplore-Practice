package Pratice;

public class StudentGrade {
	private int id,marks;
	private String name;
	private char grade;
	public StudentGrade(int id,String name,int marks,char grade)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.grade=grade;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
}
