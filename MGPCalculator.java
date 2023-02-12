//Shahmeer Khan, Fall Quarter, CS Fundamentals



import java.util.*;


public class MGPCalculator {

public static int LEG = 0;
public static double CUR_OD = 0;
public static double DIST = 0;
public static double TOTAL_MPG = 0;

	
	public static double getMinimumDouble(Scanner input, double min, String quote) {
		
		double num = 0;
		
		System.out.print(quote);
		num=input.nextDouble();
		
		while(num<=min) {
			System.out.print("Please enter a value greater than " + min);
			System.out.println("");
			System.out.print(quote);
			num = input.nextDouble();
		}
		
		
		return num;
		
		
	}
	
//Q1 format	
	
	public static void legs(Scanner input) {
		String yn = "y";
		double fuel = 0;
		double fuel_min = 0;
		double curr_dist = 0;
		double mpg = 0;
		
		
		double od = getMinimumDouble(input, 0.0, "Enter starting odometer reading: ");
		
		while(yn.equals("y")) {
			
			LEG+=1;
			
			
			CUR_OD = od;
			
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Data for leg#" + LEG);
			
			od = getMinimumDouble(input, CUR_OD, "Odometer reading at the end: ");
			
			fuel = getMinimumDouble(input, 0.0, "Fuel consumed in gallons: ");
			
//I needed to add the divided by 100 in a separate line because if I add it to the same line my code glitches and does not round properly
			curr_dist = od-CUR_OD;
			
			DIST += curr_dist;
			mpg = Math.round(curr_dist/fuel*100);
			mpg=mpg/100;
			
			TOTAL_MPG+=fuel;
			
			
			
			System.out.println("MPG for leg #" + LEG + " = " + mpg);
			
			CUR_OD = od;
			
			
			System.out.print("Continue (y/n)? ");
			yn = input.next();
			
			
			
			
			
			
			
			
		}

		TOTAL_MPG = Math.round(DIST/TOTAL_MPG*100);
		TOTAL_MPG/=100;
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println("Total number of legs in the journey: " + LEG);
		System.out.println("Final MPG for the journey:" + TOTAL_MPG);
		System.out.println("Bye!");
		
	}
	
	

	
	
	public static void main(String args[]) {
		
		System.out.println("Welcome to the MPG Calculator for a multi-leg journey");
		
		System.out.println("");
		//System.out.print("Enter starting odometer reading: ");
		Scanner input = new Scanner(System.in);
	
		legs(input);
		input.close();
		
		
		

		
		
	}
	
}
