package Pratice;

public class CustomerOpertions {
	public static Customer searchcustomer(Customer[] Customerarr,int id)
	{
		for(Customer cr:Customerarr)//Customer is array data type
		{
			if(cr.getId()==id)
			{
				return cr;//return the current object which is matched or null is passed
			}
		}
		return null;
	}
	public static Customer updatecustomer(Customer[] Customerarr,Customer obj)
	{
		for(Customer cr:Customerarr)
		{
			if(cr.getId()==obj.getId())
			{
				cr.setId(obj.getId());
				cr.setAge(obj.getAge());
				cr.setName(obj.getName());
				cr.setDob(obj.getDob());
				cr.setEmail(obj.getEmail());	
				return cr;
			}
		}
		return null;
	}
	public static Customer[] groupby(Customer[] Customerarr,int age)
	{
		int count=0;
		for(Customer cs:Customerarr)
		{
			if(cs.getAge()==age)
			{
				count++;
			}
		}
		if(count!=0)
		{
			Customer grouparr[]=new Customer[count];
			int elements=0;
			for(Customer cs:Customerarr)
			{
				if(cs.getAge()==age)
				{
					grouparr[elements]=cs;
					elements++;
				}
			}
			return grouparr;
		}
		return null;
	}
	public static void main(String args[])
	{
		Customer obj=new Customer(100,21,"law","25/04/2001","law@gmail.com");
		Customer obj1=new Customer(101,20,"bri","20/01/2001","bri@gmail.com");
		Customer obj2=new Customer(102,20,"sye","30/03/2001","sye@gmail.com");
		Customer obj3=new Customer(103,20,"pacha","23/01/2001","pacha@gmail.com");
		
		Customer[] Customerarr={obj,obj1,obj2,obj3};
		System.out.println("Search by value 101 :\n");
		Customer srobj=searchcustomer(Customerarr,101);
		System.out.println(srobj.getId()+" "+srobj.getName()+" "+srobj.getAge()+" "+srobj.getDob()+" "+srobj.getEmail());
		//srobj is searchobject if true value is got which is stored in Customer data type in method
		Customer obj4=new Customer(102,23,"SyedAbu","30/03/2001","syed@gmail.com");
		Customer upobj=updatecustomer(Customerarr,obj4);//pass the whole obj4 and arr for iteration
		//upobj is updateobject
		//System.out.println(upobj.getId()+" "+upobj.getName()+" "+upobj.getAge()+" "+upobj.getDob()+" "+srobj.getEmail());
		
		System.out.println("\nThe updated values after updating 102 :\n");
		for(Customer loopobj:Customerarr)
		{
			System.out.println(loopobj.getId()+" "+loopobj.getName()+" "+loopobj.getAge()+" "+loopobj.getDob()+" "+loopobj.getEmail());
		}
		
		Customer groupbyarr[]=groupby(Customerarr,20);
		System.out.println("\nNow Group by age factor 20\n");
		for(Customer elements:groupbyarr)
		{
			System.out.println(elements.getId()+" "+elements.getName()+" "+elements.getAge()+" "+elements.getDob()+" "+elements.getEmail());
		}
	}
}
