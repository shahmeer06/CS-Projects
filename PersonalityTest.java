//Shahmeer Khan, Fundaentals of CS, Fall Quarter

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class PersonalityTest {

	public static final double[] MAX_VALUES = {10, 20, 20, 20};
	public static final int DIMENSIONS = 4; 
	public static final String[] OPTIONS = {"EI", "SN", "TF", "JP"}; 
	
	
	public static void main(String args[]) throws FileNotFoundException{
		
		System.out.print("Enter file name ");
		Scanner input = new Scanner(System.in);
		String inp = input.next();
		Scanner input_file = new Scanner(new File(inp));
		String new_output = inp.substring(0, inp.length()-4);
		
		
		
		PrintStream output_file = new PrintStream(new_output + "-out.txt");
		
		
		processPerson(input_file, output_file);

		
	}
	
	public static void processPerson(Scanner input, PrintStream out) {
		
		
		
		while(input.hasNextLine()) {
			
			String name = input.nextLine();
			
			int[] tally = computeTally(input.nextLine());
			double[] percentage = computePercentage(tally);
			String[] letter = letter(percentage);
			
			out.println(name + ":");
			
			for(int i = 0; i<tally.length; i++) {
				
				out.print(Math.round(MAX_VALUES[i]-tally[i]) + "A-" + tally[i] + "B ");
				
			}
			out.println("");
			out.print("[");
			for(int i = 0; i<percentage.length; i++) {
				
				out.print(Math.round(percentage[i]*100) + "%");
				
				if(i!=3) {
					
					out.print(", ");
					
				}
				
				
				
			}
			out.print("]");
			out.print(" = ");
			for(int i = 0; i<letter.length; i++) {
				
				out.print(letter[i]);
				
			}
			
			
			out.println("");
			
		}
		
		
		
	}
	
	public static int[] computeTally(String response) {
		
		int[] bCounts
				= {0, 0, 0, 0};

		int x = 0;
		
		for(int i = 0; i<response.length(); i++) {
			char res = response.charAt(i);
			if(res == 'B') {
				
				if(i%7==0) {
					
					bCounts[0] += 1;
					
				} else if(i%7 == 1 || i%7 == 2){
					
					bCounts[1] +=1;
					
				} else if(i%7 == 3 || i%7 == 4){
					
					bCounts[2] +=1;
					
				}  else {
					
					bCounts[3]+=1;
				}
				
			}
		}	
		
		return(bCounts);
		
	}
		
	

	
	public static double[] computePercentage(int[] count) {
		
		double[] perc = {0, 0, 0, 0};
		
		
		
		
		for(int i = 0; i<count.length; i++) {
			
			perc[i] += (count[i]/MAX_VALUES[i]);
			
			
		}
		
		return(perc);
	}
	
	public static String[] letter(double[] tally) {
		
		String[] letters= new String[DIMENSIONS];
		
		for(int i = 0; i<tally.length; i++) {
			
			if(tally[i]<.5) {
				
				letters[i] = OPTIONS[i].substring(0,1);
				
			} else {
				
				letters[i] = OPTIONS[i].substring(1,2);
				
			}
			
			
			
		}
		
		return(letters);
		
	}
	
	
}
