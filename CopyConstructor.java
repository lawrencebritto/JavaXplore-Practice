package Pratice;

public class CopyConstructor {

	int id;
	String name,dept;
	public CopyConstructor(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	public CopyConstructor(CopyConstructor obj)
	{
		this.id=obj.id;//the obj which is to be copied
		this.name=obj.name;
		this.dept=obj.dept;
	}
	
}
