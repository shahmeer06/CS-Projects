//Shahmeer Khan, Fall Quarter, Monday 10/17, CS Fundamentals

import java.util.Scanner;
public class VolumeComparison {

	public static String getShapeType(String shape) {
		
		shape.toLowerCase();
		return shape;
		
	}
	
//Method to find Box Vol	
	public static double promptCalculatePrintBoxVolume(Scanner console) {
		

		System.out.print("Specify box width: ");		
		
		
		double width = console.nextDouble();
		
		

		System.out.print("Specify box depth: ");
		
		double depth = console.nextDouble();
		
		
		

		System.out.print("Specify box height: ");
		
		double height = console.nextDouble();
		
		

		
		
		
		double boxVol = width * height * depth;
		
		boxVol = Math.round(boxVol * 1000.0)/1000.0;
		
		
		
		
		
		return boxVol;
		
	}
	
//Method to find Cone Vol	
	public static double promptCalculatePrintConeVolume(Scanner console) {
		
		

		System.out.print("Specify cone base: ");		
		
		
		double radius = console.nextDouble();
		
		
	
		System.out.print("Specify cone height: ");
		
		double height = console.nextDouble();
		
		

		
		
	


		
		
		
		double coneVol = 1.0/3 * Math.PI * Math.pow(radius, 2) * height;
		
		coneVol = Math.round(coneVol*1000.0)/1000.0;
		

		
		return coneVol;
		
	}

//Method to find Sphere Vol
	public static double promptCalculatePrintSphereVolume(Scanner console) {
		
		
		

		System.out.print("Specify sphere radius: ");		
		
		
		double radius = console.nextDouble();
		

		
		

		
		
	
	


		
		
		double sphereVol = (4 * Math.PI * Math.pow(radius, 3))/3;
		sphereVol = Math.round(sphereVol *1000.0)/1000.0;

		return sphereVol;
		
	}
	
//This global variable is returned as the volume	
	public static Double VOL = null;	
	
//This methos uses the shape input to find which volume formula to use
	public static Double promptCalculateVolume(String shape, Scanner console) {
		String shape_input = shape;
		
		if (shape_input.equals("box")) {
		
			VOL = promptCalculatePrintBoxVolume(console);

			
		}
		
		if(shape_input.equals("cone")) {
		
			VOL = promptCalculatePrintConeVolume(console);
			
			
		}
		
		if(shape_input.equals("sphere")) {
			
			VOL = promptCalculatePrintSphereVolume(console);
			
			
		}
		
		return VOL;
		
		
		
		
		

	}
	
	
	
	

	public static void main(String args[]) {

//inputs
		Scanner console = new Scanner(System.in);
		System.out.print("Please choose your shape(box, cone, or sphere)");
		String shape = console.next();
		
		
		
		double vol = promptCalculateVolume(getShapeType(shape),console);
		System.out.println("The volume of the " + shape + "is (" + VOL+ ") cube units.");
		
		System.out.println();
		
		console = new Scanner(System.in);
		System.out.print("Please choose your shape(box, cone, or sphere)");
		String sh = console.next();
	
		
		
		double vol2 = promptCalculateVolume(getShapeType(sh), console);
		System.out.println("The volume of the " + sh + " is (" + vol2+ ") cube units.");
		

		System.out.println("");
		
		
//Comparison
		
		if(vol > vol2) {
			System.out.println("The volume of the " + shape + " (" + vol + " cube units)" + " is greater than the volume of the " + sh + " (" + vol2 + ").");
		}
		
		if(vol < vol2) {
			System.out.println("The volume of the " + shape + " (" + vol + " cube units)" + " is less than the volume of the " + sh + " (" + vol2 + ").");
		}
		
		else {
			System.out.println("The volume of the " + shape + " (" + vol + " cube units)" + " is equal to the volume of the " + sh +" (" +  vol2 +  " cube units).");
		}
		
		
		
		
		
		
	}
	
	
	
	
	
}
