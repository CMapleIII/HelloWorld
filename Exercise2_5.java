import java.util.Scanner;

public class Exercise2_5 
{
	private static Scanner s;

	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		double subtotal, gratuityRate, total, gratuity;
		
		System.out.print("Enter subtotal: ");
		subtotal = s.nextDouble();
		
		System.out.print("Enter gratuity rate: ");
		gratuityRate = s.nextDouble();
		
		gratuity = (subtotal * gratuityRate) / 100;
		total = subtotal + gratuity;
		
		System.out.print(" The gratuity is $" + gratuity + "," + " and the total is $" + total + ".");
	}
}