package Pratice;
public class StaticnNon {
	static int a=0;
	int b=0;
	public int test()
	{
		a++;
		return a;
	}
	public int test1()
	{
		b++;
		return b;
	}
	public static void main(String[] args)
	{
		StaticnNon obj=new StaticnNon();
		StaticnNon obj1=new StaticnNon();
		StaticnNon obj2=new StaticnNon();
		StaticnNon obj3=new StaticnNon();
		StaticnNon obj4=new StaticnNon();
		StaticnNon obj5=new StaticnNon();
		System.out.println(obj.test());
		System.out.println(obj1.test());
		System.out.println(obj2.test());
		System.out.println(obj3.test1());
		System.out.println(obj4.test1());
		System.out.println(obj5.test1());
		
	}
}
