package Pratice;
import java.util.*;
public class NavelVesselSolution {
	public static int findAvgVoyagesByPct(NavelVessel[] arr,int percentage)
	{
		int avr=0,per=0,count=0;
		NavelVessel[] percentageArr=new NavelVessel[0];
		for(int i=0;i<arr.length;i++)
		{
			per=((arr[i].getNoOfVoyagesCompleted()*100)/arr[i].getNoOfVoyagesPlanned());
			if(per>=percentage)
			{
				avr=avr+arr[i].getNoOfVoyagesCompleted();
				count++;
			}
		}
		avr=avr/count;
		return avr;
	}
	public static NavelVessel findVesselByGrade(NavelVessel[] arr,String purpose)
	{
		int per=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getPurpose().equalsIgnoreCase(purpose))
			{
				per=((arr[i].getNoOfVoyagesCompleted()*100)/arr[i].getNoOfVoyagesPlanned());
				if(per==100)
				{
					arr[i].setClassification("star");
				}else if(per<=99 && per>=80)
				{
					arr[i].setClassification("leader");
				}else if(per<=79 && per>=55)
				{
					arr[i].setClassification("inspirer");
				}else
				{
					arr[i].setClassification("striver");
				}
				return arr[i];
			}
		}
		return null;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		NavelVessel[] arr=new NavelVessel[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new NavelVessel(obj.nextInt(),obj.next(),obj.nextInt(),obj.nextInt(),obj.next());
		}
		int percentageParameter=obj.nextInt();
		String purposeParameter=obj.next();
		int average=findAvgVoyagesByPct(arr,percentageParameter);
		NavelVessel set=findVesselByGrade(arr,purposeParameter);
		System.out.println(average);
		if(set!=null)
		{
			System.out.println(set.getClassification());
		}else
		{
			System.out.println("No navel vessel is available");
		}
	}
}
