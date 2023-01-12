package Pratice;

public class Inventory {
	private int inventoryId;
	private int maximumQuantity;
	private int currentQuantity;
	private int threshold;
	private String condition;
	public Inventory(int inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
		super();
		this.inventoryId = inventoryId;
		this.maximumQuantity = maximumQuantity;
		this.currentQuantity = currentQuantity;
		this.threshold = threshold;
	}
	public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}
	public int getMaximumQuantity() {
		return maximumQuantity;
	}
	public void setMaximumQuantity(int maximumQuantity) {
		this.maximumQuantity = maximumQuantity;
	}
	public int getCurrentQuantity() {
		return currentQuantity;
	}
	public void setCurrentQuantity(int currentQuantity) {
		this.currentQuantity = currentQuantity;
	}
	public int getThreshold() {
		return threshold;
	}
	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
}
