/*Create java application for the following
Accept 2 numbers from user & operation to perform
1. Add 2.Subtract 3. Multiply 4.Divide 5.Exit
Display the result of the operation. 
Java app must continue to run till user chooses exit option.*/

import java.util.*;
class Q2{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		int total=0;
		while(!exit)
		{
			System.out.println("Enter First Number");
			int a=sc.nextInt();
			System.out.println("Enter Second Number");
			int b=sc.nextInt();
			System.out.printf("*******Simple calculator ******%n 1.Addition    %n 2.Substraction  %n 3.Multiplication       %n 4.Division %n  5.Exit %n" );
			
			
			switch(sc.nextInt())
			{
				case 1:
						System.out.println("Addition is "+(a+b));
						
						break;
				case 2:
						System.out.println("Substraction  is "+(a-b));
						
						break;
				case 3:	
						System.out.println("Multiplication is "+(a*b));
					
						break;
				case 4:
						System.out.println("Division is "+(a/b));
						break;
				case 5:
						System.out.println("Thanks for using Calculator !!");
						exit=true;
						break;
				default:
						System.out.println("Enter Valid Input");
			}
		}
		
	}
}
