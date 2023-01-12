package Pratice;
import java.util.*;
public class Solution {
	public static double calculateSolution(Account ac,int noOfYears)
	{
		double interest=ac.getInterestRate()+(ac.getInterestRate()*noOfYears)/100;
		double value=(ac.getBalance()*interest)/100;
		return value;
	}
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int id=obj.nextInt();
		double balance=obj.nextDouble();
		double InterestRate=obj.nextDouble();
		int noOfYears=obj.nextInt();
		Account ac=new Account(id,balance,InterestRate);
		double returnInterest=calculateSolution(ac,noOfYears);
		String format=String.format("%.3f",returnInterest);
		System.out.println(format);
	}
}
