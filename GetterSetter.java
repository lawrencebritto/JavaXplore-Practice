package Pratice;
public class GetterSetter {
	private int id;
	private String name;
	GetterSetter()
	{
		System.out.println("Example of getter and setter with constructors");
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public int getid()
	{
		return this.id;
	}
	public String getname()
	{
		return this.name;
	}
	GetterSetter(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("Your id is "+id);
		System.out.println("Your name is "+name);
	}
}
