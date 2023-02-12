
public class Car {

	private String model;
	private String color;
	private Boolean isRunning = false;
	private int currentSpeed;
	private int maxSpeed;
	
	public String getModel(){
		return model;		
	}
	
	public String getColor(){
		return color;		
	}
	
	public Boolean getIsRunning(){
		return isRunning;		
	}
	
	public int getCurrentSpeed(){
		return currentSpeed;		
	}
	
	public int getMaxSpeed(){
		return maxSpeed;		
	}
	
	
	
	public Car() {
		this.model = "Toyota Corolla";
		this.color = "Yellow";
		this.maxSpeed = 50;
		
		
	}
	
	public Car(String model, String color, int maxSpeed) {
		
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
	public void startEngine() {
		
		if(getIsRunning()==true) {
			
			throw new IllegalStateException("Engine already running.");
		} 
		
		this.isRunning = true;
		
		
	}
	
	public void stopEngine() {
		
		if(getIsRunning() == false) {
			
			throw new IllegalStateException("Car is not running.");
			
		} else if(getCurrentSpeed() > 0){
			
			throw new IllegalStateException("Reduce speed to 0 first.");
			
		} else {
			
			this.isRunning = false;
			
		}
		
	}
	
	public void accelerate() {
		
		if(getIsRunning() == false) {
			
			throw new IllegalStateException("Start engine first.");
			
		} else {
			
			this.currentSpeed +=10;
			
			if(currentSpeed > maxSpeed) {
				
				this.currentSpeed = maxSpeed;
				
			} 
			
		}
		
	}
	
	public void brake() {
		this.currentSpeed-=15;
		if(currentSpeed <0) {
			
			this.currentSpeed = 0;
			
		}
		
	}
	
	public String toString() {
		
		if(isRunning == true) {
			return color + " " + model + "(Engine running: YES Speed:" + currentSpeed + " mph";
		} else {
			return color + " " + model + "(Engine running: NO Speed:" + currentSpeed + " mph";
		}
		
		
		
		
	}
	
	
	
	
	
}































