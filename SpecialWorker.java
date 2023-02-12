
public class SpecialWorker extends Worker{

	private int code;
	
	
	public SpecialWorker(int code) {
		super();
		this.code = code;
		
	}
	
	public SpecialWorker(String name, int code) {
		
		super(name);
		this.code = code;
		
		
	}
	
	
	
	
	public boolean verifyPay(double hourlyPay) {
		
		if ( hourlyPay>0) {
	         int dime = (int)(hourlyPay*100) % (100);
	         int penny = (int)(hourlyPay *100) % (10);
	         dime/=10;
	         if (penny + dime != code) {
	            return false;
	         } 
	      } 
		
		return true;
		
	    
	   }
		
	
	
	public int returnCode() {
		
		return code;
		
	}
	
	public void volunteer() {
		
		super.setHourlyPay(0);;
		
	}
	
	public String toString() {
		
		return "Special " + super.toString();
		
	}
	
	
}
