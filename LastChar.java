package Pratice;
import java.util.*;
public class LastChar {
	public static String retLast(String str)
	{
		if(str.length()==1)
		{
			if((str.charAt(str.length()-1)>=48)&&(str.charAt(str.length()-1)<=57))
			{
				return "";
			}else
			{
				return str;
			}
		}else
		{
			if((str.charAt(str.length()-1)>=48)&&(str.charAt(str.length()-1)<=57))
			{
				String s=str.substring(0,str.length()-1);
				return retLast(s);
			}else
			{
				String s="";
				s=s+str.charAt(str.length()-1);
				return s;
			}
		}
	}
	public static void main(String[] args)
	{
		String str="hey33 java 3 a learners";
		String strarr[]=str.split(" ");
		String result=" ";
		for(int i=0;i<strarr.length;i++)
		{
				String last=retLast(strarr[i]);
				result=result+last;
		}
		System.out.println(result);
	}
}
