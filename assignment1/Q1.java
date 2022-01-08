import java.util.*;
class Q1
{
	public static void main(String args[]){
	double a=0,b=0;
	
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextDouble()){
			 a=sc.nextDouble();	
		}
		else
		{
			System.out.println("Enter Valid Input");
			
		}
		if(sc.hasNextDouble())
		{
			b=sc.nextDouble();
			double avg=(a+b)/2;
			System.out.println(avg);
		}else{
			System.out.println("Enter Valid Input");
			
		}
		
	}
}
