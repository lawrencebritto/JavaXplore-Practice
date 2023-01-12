package Pratice;
import java.util.*;
public class BasicCollection {
	public static void main(String[] args)
	{
		ArrayList<Integer>ar=new ArrayList<Integer>();
		ar.add(23);
		ar.add(24);
		ar.add(25);
		ar.add(26);
		ar.add(27);
		Iterator<Integer>obj=ar.iterator();
		while(obj.hasNext())
		{
			Integer num=obj.next();
			System.out.println(num);
		}
	}
}
