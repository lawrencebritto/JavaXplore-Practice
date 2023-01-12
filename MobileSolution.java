package Pratice;
import java.util.*;
public class MobileSolution {
	public static int findPriceForGivenBrand(Mobile[] arr,String brand)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getBrand().equalsIgnoreCase(brand))
			{
				sum=sum+arr[i].getPrice();
			}
		}
		if(sum!=0)
		{
			return sum;
		}else
		{
			return 0;
		}
	}
	public static Mobile getPhoneIdBasedOnOs(Mobile[] arr,String os)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getOs().equalsIgnoreCase(os))
			{
				if(arr[i].getPrice()>=50000)
				{
					return arr[i];
				}
			}
		}
		return null;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		
		/*for(int i=0;i<4;i++)
		{
			arr[i]=new Mobile(obj.nextInt(),obj.next(),obj.next(),obj.nextInt());
		}*/
		Mobile obj1=new Mobile(111,"ios","apple",30000);
		Mobile obj2=new Mobile(222,"symbian","htc",20000);
		Mobile obj3=new Mobile(333,"android","sanmsung",50000);
		Mobile obj4=new Mobile(444,"paranoid","htc",130000);
		Mobile arr[]=new Mobile[]{obj1,obj2,obj3,obj4};
		String brandpassed="blackberry";
		String ospassed="android";
		int returnPrice=findPriceForGivenBrand(arr,brandpassed);
		if(returnPrice!=0)
		{
			System.out.println(returnPrice);
		}else
		{
			System.out.println("The given Brand is not available");
		}
		Mobile phone=getPhoneIdBasedOnOs(arr,ospassed);
		if(phone!=null)
		{
			System.out.println(phone.getPhoneId());
		}else
		{
			System.out.println("No phones are available with specified os and price range");
		}
	}
}
