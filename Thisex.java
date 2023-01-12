package Pratice;

public class Thisex {
	int id;
	String name;
	Thisex(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println(id+name);
	}
	void a(Thisex obj1)
	{
		
		System.out.println(obj1.id+obj1.name);
		System.out.println("Calling from b method");
	}
	Thisex b()
	{
		Thisex obj1=new Thisex(220262,"Bri");//second line output from this constructor
		a(this);//this passes 220261 and law to void a;
		a(obj1);//passes 220261 and Bri to void a;
		return this;//return current class instance
	}
	public static void main(String[] args)
	{
		Thisex obj=new Thisex(220261,"Law");//first line output
		//System.out.print(obj.b());
		obj.b();
	}
}
