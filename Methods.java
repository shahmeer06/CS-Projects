/* 
 * CS210 Chapter 01 (Methods - Sequence)
 * Shahmeer Khan, 9/23/22, Fall quarter 
 *
 * This program is a short puzzle.
 * Change the method definitions to get below desired output by following
 * these rules:
 * - You can change only first(), second() or third() method definition.
 * - You cannot change the main method.
 * - You cannot add System.out.println calls, you can only add calls to other methods.
 * Desired output:
 
first method
third method
third method
second method
first method
third method
third method
 
 */

public class Methods {

   public static void first() {
      // Can change this method
      System.out.println("first method");
      third();
        
        
   }

   public static void second() {
      // Can change this method
      System.out.println("second method");
      first(); 
        
   }
 
   public static void third() {
      // Can change this method
      System.out.println("third method");
      
       
        
   } 
 
   public static void main(String[] args) {
    // DO NOT change this main method
      first();
      third();
      second();
      third();
    // DO NOT change this main method
   }

}


// Desired output:
//
// first method
// third method
// third method
// second method
// first method
// third method
// third method
