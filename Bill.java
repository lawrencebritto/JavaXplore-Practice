package Pratice;

public class Bill {

	private int id,price,qty;
	private String name;
	private float total;
	public Bill(int id,String name,int qty,int price,float total)
	{
		this.id=id;
		this.name=name;
		this.qty=qty;
		this.price=price;
		this.total=total;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
}
