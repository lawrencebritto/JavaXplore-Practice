package Pratice;
import java.util.*;
public class AutonomousCarSolution {
	public static int findTestPassedByEnv(AutonomousCar[] obj,String environment)
	{
		int value=0;
		for(AutonomousCar elements:obj)
		{
			if(elements.getEnvironment().equalsIgnoreCase(environment))
			{
				value=value+elements.getNoOfTestPassed();
			}
		}
		return value;
	}
	public static AutonomousCar updateCarGrade(AutonomousCar[] obj,String brand)
	{
		for(int i=0;i<obj.length;i++)
		{
			if(obj[i].getBrand().equalsIgnoreCase(brand))
			{
				int value;
				value=(obj[i].getNoOfTestPassed()*100)/obj[i].getNoOfTestConducted();
				if(value>=80)
				{
					obj[i].setGrade("A1");
				}else
				{
					obj[i].setGrade("B2");
				}
				return obj[i];
			}
		}
		return null;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		AutonomousCar[] carArr=new AutonomousCar[4];
		/*for(int i=0;i<4;i++)
		{
			carArr[i]=new AutonomousCar(obj.nextInt(),obj.next(),obj.nextInt(),obj.nextInt(),obj.next());
		}*/
		AutonomousCar obj1=new AutonomousCar(1,"tesla",1000,500,"hills");
		AutonomousCar obj2=new AutonomousCar(1,"royce",3000,500,"desert");
		AutonomousCar obj3=new AutonomousCar(1,"tesla",2000,500,"desert");
		AutonomousCar obj4=new AutonomousCar(1,"mercedez",1500,400,"hills");
		carArr= new AutonomousCar[]{obj1,obj2,obj3,obj4};
		int testPassed=findTestPassedByEnv(carArr,"desert");
		if(testPassed!=0)
		{
			System.out.println(testPassed);
		}else
		{
			System.out.println("No tests passed");
		}
		AutonomousCar grade=updateCarGrade(carArr,"mercedez");
		if(grade!=null)
		{
			System.out.println(grade.getBrand()+"::"+grade.getGrade());
		}else
		{
			System.out.println("No car available");
		}
	}
}
