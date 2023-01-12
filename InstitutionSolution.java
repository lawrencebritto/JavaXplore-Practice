package Pratice;
import java.util.*;
public class InstitutionSolution {
	public static int findNumClearanceByLoc(Institution[] arr,String location)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getLocation().equalsIgnoreCase(location))
			{
				sum=sum+arr[i].getNoOfStudentsCleared();
			}
		}
		return sum;
	}
	public static Institution updateInstitutinGrade(Institution[] arr,String institutionName)
	{
		int ratings=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getInstitutionName().equalsIgnoreCase(institutionName))
			{
				ratings=(arr[i].getNoOfStudentsPlaced()*100)/arr[i].getNoOfStudentsCleared();
				if(ratings>=80)
				{
					arr[i].setGrade("A");
				}else
				{
					arr[i].setGrade("B");
				}
				return arr[i];
			}
		}
		return null;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		/*Institution[] arr=new Institution[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new Institution(obj.nextInt(),obj.next(),obj.nextInt(),obj.nextInt(),obj.next());
		}*/
		Institution obj1=new Institution(111,"Amirtha",5000,10000,"Chennai");
		Institution obj2=new Institution(222,"Karunya",16000,20000,"Coimbatore");
		Institution obj3=new Institution(333,"Apple",10000,12000,"Chennai");
		Institution obj4=new Institution(111,"Amirtha",6000,10000,"Vellore");
		Institution arr[]= new Institution[]{obj1,obj2,obj3,obj4};
		
		String loc="chennai";
		String instname="karunya";
		int cleared=findNumClearanceByLoc(arr,loc);
		if(cleared!=0)
		{
			System.out.println(cleared);
		}else
		{
			System.out.println("There are no cleared students in this particular location");
		}
		Institution inst=updateInstitutinGrade(arr,instname);
		if(inst!=null)
		{
			System.out.println(inst.getInstitutionName()+"::"+inst.getGrade());
		}else
		{
			System.out.println("No Institute is available with the specified name");
		}
	}
}
