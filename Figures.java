/*
* CS210 Chapter 01 (Methods - Sequence)
* Shahmeer Khan, 9/23/22, Fall quarter 
*/


public class Figures {

   public static void topTriangle() {
		System.out.println("    *");
		System.out.println("   /*\\");    
		System.out.println("  //*\\\\");
		System.out.println(" ///*\\\\\\");
		System.out.println("////*\\\\\\\\");
    
        
   }
   
   public static void bottomTriangle() {
	   System.out.println("\\\\\\\\*////");
	   System.out.println(" \\\\\\*///");
	   System.out.println("  \\\\*//");
	   System.out.println("   \\*/");  
	   System.out.println("    *");
	     
	   
	   
   }   
   
   
   public static void stem() {
	   System.out.println("    *");
	   System.out.println("    *");
	   System.out.println("   ***");
       
       
   }   
 
 
 	public static void diamond() {
 		topTriangle();
 		bottomTriangle();
      System.out.println("");
 		
	        
	        
	}
	   
 
 	public static void wineglass() {
		bottomTriangle();
		stem();
      System.out.println("");
	       
	       
	}   
	   
	   
 	public static void tree() {
 		topTriangle();
 		stem();
	       
	       
	}   
   
 	public static void main(String[] args) {
 		diamond();
 		wineglass();
 		tree();
 		
 	}

}
