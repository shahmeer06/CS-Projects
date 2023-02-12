//Shahmeer Khan, CS FUndamnetals BC, Fall Quarter, Furniture: Table


public class Table extends Furniture{
	
	
	private String wood;


	public Table(double weight, String wood) {
		super(weight);
		setWood(wood);
	}


	
	
	
	
		
		public void setWood(String wood) {
			
			if(wood.equals("Pine") || wood.equals("Oak") || wood.equals("Cherry")){
				
				this.wood = wood;
				
			}
			
			else {
				
				throw new IllegalArgumentException("Invalid Wood Value: " + wood);
				
			}
			
		}
		
		public String getWood() {
			
			return wood;
			
		}
		
	
	public String toString() {
		
		return "Table " + super.toString() + " Made of: " + wood;
		
	}
	
	
	
	
	
}
