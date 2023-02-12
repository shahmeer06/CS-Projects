import java.awt.Point;

public class Pentagon {
	private Point center;
	private double side;
	
	public Pentagon() {
		
		this.center = new Point(0,0);
		this.side = 0;
		
	}
	
	public Pentagon(Point c, double s) {
		
		this.center = c;
		this.side = s;
		
	}
	
	public Point getCenter() {
		return center;
			
	}
	
	public double getSide() {
		
		return side;
		
	}
	
	public void setCenter(Point c) {
		
		this.center = c;
		
	}
	
	public void setSide(double r) {
		
		this.side = r;
		
	}
	
	public double area() {
		
		return 0.25*Math.sqrt(5*(5+2*(Math.sqrt(5))))*Math.pow(side, 2);
		
	}
	
	public double perimeter() {
		
		return side*5;

		
	}
	
	public String toString() {
		
		return "Pentagon Side: " + side + " Center: (" + Math.round(center.getX()) + ", " + Math.round(center.getY()) + ")";
				
		
	}
	
	
	
	
	
	
}
