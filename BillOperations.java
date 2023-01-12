package Pratice;
import java.util.*;
public class BillOperations {

	public static void main(String args[])
	{
		int id,price,qty = 0;
		String name;
		float total = 0;
		char choice=0;
		Scanner scan=new Scanner(System.in);
		List <Bill> items=new ArrayList<Bill>();
		do 
		{
			System.out.print("Enter the product id      :");
			id=scan.nextInt();
			System.out.print("Enter the product name    :");
			name=scan.next();
			System.out.print("Enter the product quantity:");
			qty=scan.nextInt();
			System.out.print("Enter the product price   :");
			price=scan.nextInt();
			total=qty*price;
			items.add(new Bill(id,name,qty,price,total));//invokes the constructor and adds in list
			System.out.print("If you want to add more product 'y' else 'n' :");
			choice=scan.next().charAt(0);
		}while(choice=='y'||choice=='Y');
		for(Bill elements: items)
		{
			System.out.println(elements.getId()+" "+elements.getName()+" "+elements.getQty()+" "+elements.getPrice()+" "+elements.getTotal());
		}
	}
}
