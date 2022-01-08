package com.tester;
import com.app.org.Mgr;
import com.app.org.Worker;
import java.util.*;
public class TestOrganization1 {

	public static void main(String[] args) {
		System.out.println("Enter name,DeptID,Salary,PerformanceBonus");
		
		Scanner sc=new Scanner(System.in);
		
		Mgr m=new Mgr(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble());
		
		
		System.out.println("Enter name,DeptID,Salary,PerformanceBonus");
		/*Mgr m1=new Mgr(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble());
		System.out.println(m1.toString());
		System.out.println("Perfrmance Bonus is:"+m1.getPerformanceBonus());*/
		Worker w=new Worker(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println(m.toString());
		System.out.println("Perfrmance Bonus is:"+m.getPerformanceBonus());
		System.out.println(w.toString());
		System.out.println(w.gethourlyrate());
	}

}
