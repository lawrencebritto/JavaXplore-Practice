package Pratice;

public class Medicine {

	private String medicineName;
	private String batch;
	private String disease;
	private int price;
	public Medicine(String medicineName, String batch, String disease, int price) {
		this.medicineName = medicineName;
		this.batch = batch;
		this.disease = disease;
		this.price = price;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
