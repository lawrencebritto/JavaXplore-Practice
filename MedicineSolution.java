package Pratice;
import java.util.*;
public class MedicineSolution {

	public static Medicine[] getPriceByDisease(Medicine[] arr,String disease)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getDisease().equalsIgnoreCase(disease))
			{
				count++;
			}
		}
		if(count!=0)
		{
			Medicine[] newArr=new Medicine[count];
			int elements=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i].getDisease().equalsIgnoreCase(disease))
				{
					newArr[elements]=arr[i];
					elements++;
				}
			}
			for(int i=0;i<newArr.length;i++)
			{
				for(int j=i+1;j<newArr.length;j++)
				{
					if(newArr[i].getPrice()>newArr[j].getPrice())
					{
						Medicine temp=newArr[i];
						newArr[i]=newArr[j];
						newArr[j]=temp;
					}
				}
			}
			return newArr;
		}
		return null;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		Medicine[] arr=new Medicine[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new Medicine(obj.next(),obj.next(),obj.next(),obj.nextInt());
		}
		String parameter=obj.next();
		Medicine[] returnArr=getPriceByDisease(arr,parameter);
		for(Medicine elements:returnArr)
		{
			System.out.println(elements.getPrice());
		}
	}
}
