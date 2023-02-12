/*
Shahmeer Khan
CS Fundamentals
Fall Quarter

*/
public class StarsNumbers {
	
	public static void patternDown(){
	int length = 9;
	int star = 2;
	int num = 0;
			
		for(int i = 4; i>0; i--) {
			for(int s=star; s>0; s--) {
				System.out.print("*");
			}
			
			for(int n=length; n>0; n--) {
				num+=1;
				System.out.print(num);
				
			}
			
			for(int s=star; s>0; s--) {
				System.out.print("*");
			}
			
			
			System.out.println();
			star+=1;
			length-=2;
			num = 0;
			
			
		}
		
		
		 
		
	}
	
	
	public static void patternUp(){
		int length = 1;
		int star = 6;
		int num = 0;
				
			for(int i = 5; i>0; i--) {
				
				for(int s=star; s>0; s--) {
					System.out.print("*");
				}
				
				for(int n=0; n<length; n++) {
					num+=1;
					System.out.print(num);
					
				}
				
				for(int s=star; s>0; s--) {
					System.out.print("*");
				}
				
				
				System.out.println();
				star-=1;
				length+=2;
				num = 0;
				
				
			}
			
			
			 
			
		}
	
	public static void main(String[] args) {
		 patternDown();
		 patternUp();
		 
	}
	
	
}	





