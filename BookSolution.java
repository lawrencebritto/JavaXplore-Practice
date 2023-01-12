package Pratice;
import java.util.*;
public class BookSolution {
	public static int findTotalBooksByGivenAuthor(Book[] arr,String bookAuthor)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getBookAuthor().equalsIgnoreCase(bookAuthor))
			{
				count++;
			}
		}
		return count;
	}
	public static Book[] getBookName(Book[] arr,String bookPublisher)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getBookPublisher().equalsIgnoreCase(bookPublisher))
			{
				count++;
			}
		}
		if(count!=0)
		{
			Book[] newArr=new Book[count];
			int j=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i].getBookPublisher().equalsIgnoreCase(bookPublisher))
				{
					newArr[j++]=arr[i];
				}
			}
			return newArr;
		}
		return null;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		/*Book[] arr=new Book[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new Book(obj.next(),obj.next(),obj.next());
		}
		String parameterBookAuthor=obj.next();
		int count=findTotalBooksByGivenAuthor(arr,parameterBookAuthor);
		System.out.println(count);*/
		
		Book obj1=new Book("Science","janae","smvec");
		Book obj2=new Book("Maths","soundarya","mit");
		Book obj3=new Book("Social","janae","smvec");
		Book obj4=new Book("English","lawrence","mailam");
		Book[] objArr=new Book[]{obj1,obj2,obj3,obj4};
		int count=findTotalBooksByGivenAuthor(objArr,"janae");
		System.out.println(count);
		Book[] returnArr=getBookName(objArr,"smvec");
		for(Book elements:returnArr)
		{
			System.out.println(elements.getBookName());
		}
	}
}
