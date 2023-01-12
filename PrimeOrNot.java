package Pratice;

import java.util.Arrays;

public class PrimeOrNot {
	public static boolean primeOrNot(int num)
	{
		for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
	}
	public static void main(String[] args)
	{
		int arr[]=new int[] {10,12,11,13,14,15,17,19,20};
		int newarr[]=new int[0];
		for(int i=0;i<arr.length;i++)
		{
			boolean decider=primeOrNot(arr[i]);
			//System.out.println(decider);
			if(decider==true)
			{
				newarr=Arrays.copyOf(newarr,newarr.length+1);
				newarr[newarr.length-1]=arr[i];
			}
		}
		for(int i=0;i<newarr.length;i++)
		{
			System.out.println(newarr[i]);
		}
		
	}
}
