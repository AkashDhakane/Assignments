package tester;

import java.util.Scanner;
import static com.app.emp.Emp.offset;
import com.app.emp.Emp;
import com.app.emp.Mgr;
import com.app.emp.Worker;

public class Test1 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	boolean exit=false;
	int counter=0;
	System.out.println("Enter max no of emps");
	Emp[] emps=new Emp[sc.nextInt()];
	while(!exit) {
		System.out.printf("=======Menu======%n1.Hire Manager %n 2.Hire worker %n 3.Display Details %n 4.Set basic %n5.Exit %n ");
	System.out.println("Choose Option");
	switch (sc.nextInt()) {
	case 1://hire manager
		if(counter<emps.length)
		{
			System.out.println("Enter mgr details:name ,deptID, basic,bonus");
			emps[counter++]=new Mgr( sc.next(),sc.next(),sc.nextDouble(), sc.nextDouble());
		}
		else
		{
			System.out.println("Recruitment Over !!!");
		}
		break;
	case 2:
		if(counter<emps.length)
		{
			System.out.println("Enter Worker details: name ,deptID,basic,WorkingHOurs,HourlyRate");
			emps[counter++]=new Worker( sc.next(),sc.next(),sc.nextDouble(), sc.nextInt(),sc.nextDouble());
		}
		else
		{
			System.out.println("Recruitmet is done");
		}
		break;
	case 3:
		System.out.println("Organization Details");
		for(Emp e:emps)
		{
			if(e!=null) {
			System.out.println(e);//
			System.out.println("net Sal"+e.sal());
			if(e instanceof Mgr)
			{
				System.out.println("Bonus: "+((Mgr)e).getPerformanceBonus());
			}
			else
				System.out.println("Hourly Rate:"+((Worker)e).netSal());
		}
		}
		break;
		
	case 4:
	
		System.out.println("Enter index and basic salary increament");
		int index=sc.nextInt()-offset;
		if(index<counter && index >=0) {
		double sal=sc.nextDouble();
		emps[index].setBasic(emps[index].getBasic()+sal);
		}
		break;
	case 5:
		exit=true;
		
	default:
		System.out.println("Enter valid choice");
		break;
	}
	}
	
	}
	
}
