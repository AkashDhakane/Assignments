
import java.util.*;
class Q4{
	public static void main(String args[])
	{	
	Scanner sc=new Scanner(System.in);
			System.out.println("Enter How many Number do u want to Insert ??");
			int size=sc.nextInt();
			double arr[]=new double[size];
			System.out.println("Enter VAlues");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextDouble();
			}
			boolean exit=false;
			
		while(!exit)
		{
			
			System.out.printf("*******Select Any Option ******%n 1.Double    %n 2.find Square  %n 3.Square Root  %n     4.Exit %n" );
			
			
			switch(sc.nextInt())
			{
				case 1:
						for(double ele:arr)
						{
							System.out.println(ele+ele);
						}
						break;
				case 2:
						for(double ele:arr)
						{
							System.out.println(ele*ele);
						}
						break;
				case 3:
						for(double ele:arr)
						{
							System.out.println(Math.sqrt(ele));
						}
						break;
				case 4:
						exit=true;
						break;		
			}
	}
}
}