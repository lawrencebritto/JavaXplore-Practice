package Pratice;

public class ArrayExample {
	public static String search(int arr[],int search)
	{
		for(int element:arr)
		{
			if(element==search)
			{
				return "Element "+search+" found";
			}
		}
		return null;
	}
	public static int[] replace(int arr[],int search,int replace)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				arr[i]=replace;
			}
		}
		return arr;
	}
	public static int[] sort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
				
		}
		return arr;
	}
	public static void main(String args[])
	{
		int arr[]=new int[] {5,4,9,2,1};
		for(int elements:arr)
		{
			System.out.print(elements+"\t");
		}
		System.out.println("\n");
		System.out.println(search(arr,4));
		int array[]=replace(arr,9,3);
		System.out.println("\nAfter replacing\n");
		for(int elements:array)
		{
			System.out.print(elements+"\t");
		}
		int sortarray[]=sort(arr);
		System.out.println("\nAfter sorting\n");
		for(int elements:sortarray)
		{
			System.out.print(elements+"\t");
		}
		
	}
}
