/*Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option(10) , display total bill & exit,;*/
import java.util.*;
class Q2{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		int total=0;
		while(!exit)
		{
			System.out.printf("*******Menu Card******%n 1.Dosa    50 Rs %n 2.Samosa  25 Rs  %n 3.Idli     60 Rs %n 4.Generate Bill %n");
			switch(sc.nextInt())
			{
				case 1:
						System.out.println("You Have Added Dosa");
						total+=50;
						break;
				case 2:
						System.out.println("You Have Added Samosa");
						total+=25;
						break;
				case 3:	
						System.out.println("You Have Added Idli");
						total+=60;
						break;
				case 4:
						System.out.println("Your Total Bill is : "+total);
						exit=true;
						break;
				default:
						System.out.println("Enter Valid Input");
			}
		}
		
	}
}
