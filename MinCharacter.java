package Pratice;
import java.util.Arrays;
public class MinCharacter {
	public static int minChar(char num)
	{
		return num;
	}
	public static void main(String[] args)
	{
		String str="Hello";
		int[] arr=new int[0];
		for(int i=0;i<str.length();i++)
		{
			arr=Arrays.copyOf(arr,arr.length+1);
			arr[arr.length-1]=minChar(str.charAt(i));
		}
		Arrays.sort(arr);
		char min=(char)arr[0];
		System.out.println(min);
	}
}
