//Shahmeer Khan, CS FUndamnetals BC, Fall Quarter, Furniture: Furniture


public class Furniture {

	private double weight;
	private int inventoryId;
	static int initialInventoryId = 111111;
	
	
	private void setId() {
		
		inventoryId = initialInventoryId;
		initialInventoryId +=1;
		
	}
	
	public Furniture(double weight) {
		
		setWeight(weight);
			
		 
			
		setId();
			
			
		
		
	}
	
	public int returnId() {
		
		return inventoryId;
		
	}
	
	
	public double getWeight() {
		
		return weight;
		
	}
	
	
	public void setWeight(double weight) {
		
		if(weight <= 0) {
			
			throw new IllegalArgumentException("Weight must be positive");
			
		} else {
			
			this.weight = weight;
			
		}
		
	}
	
	public String toString() {
		
		return "Item Number: " + inventoryId + " Weight: " + weight;
		
		
	}
	
	
	
	
	
}
