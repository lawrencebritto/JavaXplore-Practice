package Pratice;
import java.util.*;
public class Multiarr {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int arr[][]=new int[10][10];
		int arr1[][]=new int[10][10];
		int arr2[][]=new int[10][10];
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				arr[i][j]=obj.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				arr1[i][j]=obj.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				arr2[i][j]=0;
				for(int k=0;k<2;k++)
				{
					arr2[i][j]+=arr[i][k]*arr1[k][j];
				}
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
