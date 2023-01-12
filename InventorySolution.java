package Pratice;
import java.util.*;
public class InventorySolution {
	public static Inventory[] replenish(Inventory[] arr,int threshold)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getThreshold()<=threshold)
			{
				count++;
			}
		}
		if(count!=0)
		{
			Inventory[] replenisharr=new Inventory[count];
			int elements=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i].getThreshold()<=threshold)
				{
					if(arr[i].getThreshold()>75)
					{
						arr[i].setCondition("Critical Filling");
					}else if(arr[i].getThreshold()>50 && arr[i].getThreshold()<=75)
					{
						arr[i].setCondition("Moderate Filling");
					}else
					{
						arr[i].setCondition("Non-Critical Filling");
					}
					replenisharr[elements]=arr[i];
					elements++;
				}
			}
			return replenisharr;
		}
		return null;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		Inventory arr[]=new Inventory[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new Inventory(obj.nextInt(),obj.nextInt(),obj.nextInt(),obj.nextInt());
		}
		int limit=obj.nextInt();
		Inventory[] limitobj=replenish(arr,limit);
		for(Inventory elements:limitobj)
		{
			System.out.println(elements.getInventoryId()+"  "+elements.getCondition());
		}
	}
}
