//Shahmeer Khan, Fall Quarter, Fundamentals of Computer Science


import java.io.*;
import java.util.*;


public class countingChange {

	
	public static void main(String args[]) throws FileNotFoundException{
		System.out.print("Enter file name ");
		Scanner input = new Scanner(System.in);
		String inp = input.next();
		Scanner input_file = new Scanner(new File(inp));
		String new_output = inp.substring(0, inp.length()-4);
		

		
		PrintStream output_file = new PrintStream(new_output + "-out.txt");
		
		
		countChange(input_file, output_file);
	}
	
	
	public static void countChange(Scanner input, PrintStream output) {
		int line_count = 0;
		double sum = 0;
		
		while(input.hasNext()) {
			line_count+=1;
			String line = input.nextLine();
			
			output.print("Line " + line_count + " : $");
			
			output.printf("%.2f", processLine(line)/100);
			output.println("");
			sum+=processLine(line);
			
		}
		output.println("");
		output.print("Total: $");
		output.printf("%.2f", sum/100);
		output.println("");
		output.print("Average Change: $");
		output.printf("%.2f", (sum/line_count)/100);
		

		
		
		
	}
	
	public static double processLine(String line) {
		Scanner lineScan = new Scanner(line);
		int num = 0;
		String str = "";
		double sum = 0;
		while(lineScan.hasNext()) {
			
			if(lineScan.hasNextInt()) {
				
				num = lineScan.nextInt();
				if(num == 1) {
					
					sum+=1;
					
				} else if(num == 5) {
					
					sum+=5;
					
				} else if(num == 10) {
					
					sum+=10;
					
				} else if(num == 25) {
					
					sum+=25;
				}
				
				
				
			} else if(lineScan.hasNext()) {
				
				str = lineScan.next();
				str = str.toLowerCase();
				if(str.equals("penny")) {
					
					sum+=1;
					
				} else if(str.equals("nickel")) {
					
					sum+=5;
					
				} else if(str.equals("dime")) {
					
					sum+=10;
					
				} else if(str.equals("quarter")) {
					
					sum+=25;
				}
				
				
				
			}
			
			
		}
		
			
		return(sum);
			
		
		
		
		
		
		
		
	}
	
	
}
