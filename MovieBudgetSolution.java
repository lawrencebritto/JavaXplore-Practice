package Pratice;
import java.util.*;
public class MovieBudgetSolution {
	public static MovieBudget[] getMovieByGenre(MovieBudget[] arr,String genre)
	{
		MovieBudget[] tempArr=new MovieBudget[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getGenre().equalsIgnoreCase(genre))
			{
				tempArr=Arrays.copyOf(tempArr,tempArr.length+1);
				tempArr[tempArr.length-1]=arr[i];
			}
		}
		return tempArr;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		MovieBudget[] arr=new MovieBudget[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new MovieBudget(obj.next(),obj.next(),obj.next(),obj.nextInt());
		}
		String searchGenre=obj.next();
		MovieBudget[] returnArr=getMovieByGenre(arr,searchGenre);
		for(MovieBudget elements:returnArr)
		{
			if(elements.getBudget()>80000000)
			{
				System.out.println("High Budget Movie");
			}else
			{
				System.out.println("Low Budget Movie");
			}
		}
	}
}
