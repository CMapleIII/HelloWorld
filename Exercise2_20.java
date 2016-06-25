import java.util.Scanner;

public class Exercise2_20 
{
	private static Scanner s;

	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		
		double balance, annualIntrestRate, interestRate;
		
		System.out.print("Enter balance and intrest rate: ");
		
		balance = s.nextDouble();
		annualIntrestRate = s.nextDouble();
		interestRate = balance * (annualIntrestRate / 1200);
		
		System.out.print("Then interest is " + interestRate);
		
	}
}
