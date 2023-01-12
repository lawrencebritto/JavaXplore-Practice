package Pratice;
import java.util.*;
public class AssociateSolution {
	public static Associate[] associateDeptGroup(Associate[] obj,String dept)
	{
		int count=0;
		for(Associate elements:obj)
		{
			if(elements.getDept().equalsIgnoreCase(dept))
			{
				count++;
			}
		}
		if(count!=0)
		{
			Associate[] group=new Associate[count];
			int i=0;
			for(Associate elements:obj)
			{
				if((elements.getDept().equalsIgnoreCase(dept))&&(elements.getYearsOfExperience()%5==0))
				{
					group[i]=elements;
					i++;
				}
			}
			return group;
		}
		return null;
	}

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int i;
		Associate[] associateArr=new Associate[5];
		for(i=0;i<5;i++)
		{
			associateArr[i]=new Associate(obj.nextInt(),obj.next(),obj.next(),obj.nextInt());
		}
		Associate[] grouparr=associateDeptGroup(associateArr,"java");
		for(i=0;i<grouparr.length-1;i++)
		{
			System.out.println(grouparr[i].getId());
		}
	}
}
