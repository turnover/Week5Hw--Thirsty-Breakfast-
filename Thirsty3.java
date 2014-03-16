import java.util.Scanner;

public class Thirsty3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		
		String ans1 = "";
		String ans2 = "";
		
		System.out.println("Hungry.");
		
		System.out.println("Get in Line.");
		
		System.out.println("Buy Lunch.");
		
		System.out.print("Thirsty?");
		ans1 = input.nextLine();
		
		if ( "yes".equalsIgnoreCase(ans1))
		{
			System.out.println("Did you have Breakfast?");
			ans2 = input.nextLine();
			
			if ( "yes".equalsIgnoreCase(ans2))
			{
				System.out.println("Buy Diet Coke.");
			}
			else if( "no".equalsIgnoreCase(ans2))
			{
				System.out.println("Buy Coke.");
			}
		}
		else if( "no".equalsIgnoreCase(ans1))
		{
			System.out.println("Get Water");
		}
		
		System.out.println("Eat lunch.");
		
		System.out.println("Return Tray.");
		
		System.out.println("Leave.");
				
				
	}

}

	


