import java.util.Scanner;
public class changeReturn {
	final static double QUARTER_VALUE = 0.25;
	final static double DIME_VALUE = 0.10;
	final static double NICKEL_VALUE = 0.05;
	final static double PENNY_VALUE = 0.01;
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the cost:");
		double cost = key.nextDouble();
		System.out.println("Enter the amount given");
		double amount = key.nextDouble();
		double change = amount - cost;
		int dollar = (int)Math.floor(change);
		double c = change - Math.floor(change);
		int quarters = (int) (c/QUARTER_VALUE);
		c = c - quarters*QUARTER_VALUE;
		int dime = (int) (c/DIME_VALUE);
		c = c - dime*DIME_VALUE;
		int nickel = (int) (c/NICKEL_VALUE);
		c = c - nickel*NICKEL_VALUE;
		int penny = (int) (c/PENNY_VALUE);
		
		System.out.println("Change back : $"+dollar+", "+quarters+" quarters, "+dime+" dimes, "+nickel+" nickels, "+penny+" pennies.");
		

	}

}
