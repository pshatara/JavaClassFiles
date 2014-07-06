//Peter Shatara
import java.util.Scanner;
public class HW1
{
	public static void main(String args[])
	{
		int count;
		char goAgain = 'y';
	
		Scanner input = new Scanner(System.in);
	
		while (goAgain != 'n')
		{
			System.out.print("How many asterisks?: ");
			count = input.nextInt();
		
			for (int i = 0; i < count; i++)
			{
				System.out.print("*");
			}
		
			System.out.println();
			System.out.print("Go again? (y/n): ");
			goAgain = input.next().charAt(0);
		}
	}
}