package Pratice;

public class Customer {
	private int id,age;
	private String name,dob,email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer(int id, int age, String name, String dob, String email) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.dob = dob;
		this.email = email;
	}
	
}
