import java.util.Scanner;

public class Switch1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String ans1 = "";
		System.out.println("Hungry.");
		System.out.println("Get in line.");
		System.out.println("Buy lunch.");
		System.out.println("Thirsty?");
		
		Scanner input = new Scanner(System.in);
		ans1 = input.nextLine();
		{
			switch(ans1.toLowerCase())
			{
				case "yes":
				{
					System.out.println("Did you eat Breakfast?");
					ans1 = input.nextLine();
					switch(ans1.toLowerCase()) 
					{
						case "yes":
							System.out.println("Buy Diet Coke.");
							break;
						case "no":
							System.out.println("Buy Coke.");
							break;
					}
				}	
				case "no":
					System.out.println("Buy Water.");
					break;
			}
			System.out.println("Eat lunch.");
			System.out.println("Return tray.");
			System.out.println("Leave.");
		}
	}
}
