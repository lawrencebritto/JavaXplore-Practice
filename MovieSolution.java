package Pratice;
import java.util.*;
public class MovieSolution {
	
	public static int findAvgBudgetByDirector(Movie[] arr,String paraDir)
	{
		int avg=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getDirector().equalsIgnoreCase(paraDir))
			{
				avg=avg+arr[i].getBudget();
				count++;
			}
		}
		if(count!=0)
		{
			int finalAvg=avg/count;
			return finalAvg;
		}
		return 0;
	}
	public static Movie getMovieByRatingBudget(Movie[] arr,int rating,int budget)
	{
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i].getRating()==rating)&&(arr[i].getBudget()==budget)&&(arr[i].getBudget()%arr[i].getRating()==0))
			{
				return arr[i];
			}
		}
		return null;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		Movie[] arr=new Movie[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new Movie(obj.nextInt(),obj.next(),obj.nextInt(),obj.nextInt());
		}
		String paraDir=obj.next();
		int ratings=obj.nextInt();
		int budget=obj.nextInt();
		int avrBudget=findAvgBudgetByDirector(arr,paraDir);
		Movie id=getMovieByRatingBudget(arr,ratings,budget);
		if(avrBudget!=0)
		{
			System.out.println(avrBudget);
		}else
		{
			System.out.println("The given director has not yet dirested any movie");
		}
		if(id!=null)
		{
			System.out.println(id.getMovieId());
		}else
		{
			System.out.println("No movie is available in specified ratings and budget");
		}
		
	}
}
