package Pratice;

public class CopyConstructorCalling {

	public static void main(String[] args)
	{
		CopyConstructor obj=new CopyConstructor(100,"Lawrence","mca");
		System.out.println(obj.id+"  "+obj.name+"  "+obj.dept);
		System.out.println("\nCopy constructor by passing object\n");
		
		CopyConstructor obj1=new CopyConstructor(obj);//passing obj
		System.out.println(obj1.id+"  "+obj1.name+"  "+obj1.dept);
	}
}
