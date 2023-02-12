//Shahmeer Khan, CS FUndamnetals BC, Fall Quarter, Furniture: Bed


public class Bed extends Furniture {

	private String size;
	private double weight;
	
	public Bed(double weight, String size) {
		super(weight);
		setSize(size);
	}
	
	
	public void setSize(String size) {
		
		if(size.equals("Twin") || size.equals("Full") || size.equals("Queen")
				|| size.equals("King")){
			
			this.size = size;
			
		}
		
		else {
			
			throw new IllegalArgumentException("Invalid size value: " + size);
			
		}
		
	}
	
	
	public String getSize() {
		
		return size;
		
		
	}
	
	
	public String toString() {
		
		return "Bed " + super.toString() + " Size: " + size;
		
	}
	

}
