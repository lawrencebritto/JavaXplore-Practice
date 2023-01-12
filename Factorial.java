package Pratice;

import java.util.Arrays;

public class Factorial {
	public static int returnFact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args)
	{
		int[] arr=new int[] {1,2,3,4,5,6};
		int[] newarr=new int[0];
		for(int i=0;i<arr.length;i++)
		{
			newarr=Arrays.copyOf(newarr,newarr.length+1);
			newarr[newarr.length-1]=returnFact(arr[i]);
		}
		for(int elements:newarr)
		{
			System.out.println(elements);
		}
	}
}
