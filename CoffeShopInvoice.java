/* Shahmeer Khan, Fall Quarter, CS Fundamentals 1
*/

import java.util.*;

public class CoffeShopInvoice {

	
	
	
public static final int COL_WIDTH = 15;	
	
public static void printLogo() {
	for(int i = 0; i<COL_WIDTH*3+2; i++) {
		System.out.print("*");
	}
	
	System.out.println("");
	
	
	System.out.println("Welcome to AM Coffee shop");
	
	for(int i = 0; i<COL_WIDTH*3+2; i++) {
		System.out.print("*");
	}
	
	System.out.println("");
	
	System.out.println("     /\\      |\\    /|");
	System.out.println("    /  \\     | \\  / |");
	System.out.println("   /    \\    |  \\/  |");
	System.out.println("  /------\\   |      |");
	System.out.println(" /        \\  |      |");
	System.out.println("/          \\ |      |");
	
	for(int i = 0; i<COL_WIDTH*3+2; i++) {
		System.out.print("*");
	}
	
	
	
}



public static String padString(String str, int num) {

String pad = str;

	
	for(int i = num-str.length(); i>0; i--) {
		pad = " " + pad;
	}
	
	return pad;

}



public static Double roundTo2Decimal(double round) {
	
	round = Math.round(round*100)/100.0;
	return round;
	
	
}


public static Double calculateShippingCost(double pounds) {
	double shipping_cost = 0;
	shipping_cost = 0.65*pounds + 2.50;
	shipping_cost = roundTo2Decimal(shipping_cost);
	
	return shipping_cost;


}


public static Double calculateCostOfCoffee(double pounds) {
	double coffee_cost = 0;
	coffee_cost = roundTo2Decimal(pounds*9.50);
	
	return coffee_cost;
	
}


public static Double calculateTax(double date, double cost_coffee) {
	
	double tax = ((31-date)/5)/100;
	
	
	double tax_amount = cost_coffee*tax;
	
	tax_amount = roundTo2Decimal(tax_amount);
	
	
	
	
	
	return tax_amount;
	
}

public static void Col() {
	for(int i = COL_WIDTH; i>0; i--) {
		System.out.print("=");
	}
	
	System.out.print(" ");
	
	for(int i = COL_WIDTH; i>0; i--) {
		System.out.print("=");
	}
	
	System.out.print(" ");
	
	for(int i = COL_WIDTH; i>0; i--) {
		System.out.print("=");
	}
	
	
	
	
}

public static void printInvoice(int date, double pounds) {
	
	double coffee = calculateCostOfCoffee(pounds);
	double shipping = calculateShippingCost(pounds);
	double tax = calculateTax(date, coffee);
	

	double total = roundTo2Decimal(coffee + shipping + tax);
	
	System.out.println("");
	System.out.println("Shipping Cost: $" + calculateShippingCost(pounds));
	System.out.println("Cost of coffee: $" + calculateCostOfCoffee(pounds));
	for(int i = 0; i<COL_WIDTH*3+2; i++) {
		System.out.print("*");
	}
	System.out.println("");
	
	Col();
	System.out.println("");
	System.out.println(padString("Date", COL_WIDTH) + " " + padString("Tax", COL_WIDTH) + " "+ padString("Total", COL_WIDTH));
	

	
	Col();
	
	System.out.println("");
	System.out.println(padString(String.valueOf(date), COL_WIDTH) + " " + padString("$"+ String.valueOf(tax), COL_WIDTH) + " "+ padString("$"+ String.valueOf(total), COL_WIDTH));
	
	
	Col();
	tax = calculateTax(date+1, coffee);
	total = roundTo2Decimal(coffee + shipping + tax);
	
	System.out.println("");
	System.out.println(padString(String.valueOf(date+1), COL_WIDTH) + " " + padString("$"+ String.valueOf(tax), COL_WIDTH) + " "+ padString("$"+ String.valueOf(total), COL_WIDTH));
	
	
	Col();
	tax = calculateTax(date+2, coffee);
	total = roundTo2Decimal(coffee + shipping + tax);
	
	System.out.println("");
	System.out.println(padString(String.valueOf(date+2), COL_WIDTH) + " " + padString("$"+ String.valueOf(tax), COL_WIDTH) + " "+ padString("$"+ String.valueOf(total), COL_WIDTH));
	
	Col();
	
	
	
	
}



	
	
	
	public static void main(String args[]) {
		
		
		
		printLogo();
		
		System.out.println();
		Scanner num1 = new Scanner(System.in);
		
		System.out.print("Enter the date: ");
		int date = num1.nextInt();
		
		Scanner num2 = new Scanner(System.in);
		
		System.out.print("Enter the pounds of coffee: ");
		double pounds  = num2.nextDouble();
		
		
		for(int i = 0; i<COL_WIDTH*3+2; i++) {
			System.out.print("*");
		}
		
		printInvoice(date, pounds);
		
		
	}
	
	
}
