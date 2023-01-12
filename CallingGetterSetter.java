package Pratice;
public class CallingGetterSetter {
	public static void main(String args[])
	{
		
		GetterSetter obj=new GetterSetter();
		obj.setid(220262);
		obj.setname("Syed Abu");
		System.out.println("Your id is "+obj.getid());
		System.out.println("Your name is "+obj.getname());
		GetterSetter obj1=new GetterSetter(220261,"lawrence");
	}
}
