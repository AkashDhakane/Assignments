package com.tester;

import com.app.geometry.*;
import java.util.*;

public class tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many Points You want to plot??");
		Point2D arr[] = new Point2D[sc.nextInt()];
		
		boolean exit=false;
		while(!exit) {
			System.out.printf("*****Menu***** %n "+"1.Plot new point %n 2.Display all points plotted so far %n 3.Test Equality of two points %n 4.Calculate distance %n 5.Exit ");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("Enter index , x,y");
				arr[sc.nextInt()]=new Point2D(sc.nextInt(),sc.nextInt());
				break;
			case 2:
				System.out.println("Displaing all points");
				for(Point2D e:arr)
				{
					if(e!=null)
					System.out.println(e.getDetails());
				}
				break;
			case 3:
				System.out.println("Enter indexes that You want to check");
				int i1=sc.nextInt();
				System.out.println("Enter Index 2");
				int i2=sc.nextInt();
				if(i1<arr.length && i1>=0 && i2<arr.length && i2>=0 && arr[i1]!=null && arr[i2]!=null)
				{
					
					System.out.println((arr[i1].isEqual(arr[i2]))?"Points are equal":"Points are not equal");
				}
				else
				{
					System.out.println("Enter index greater than 0 and less than "+arr.length);
				}
				break;
			case 4:
				System.out.println("Enter Indexes to find out distance ");
				int B1=sc.nextInt();
				System.out.println("Enter Index 2");
				int B2=sc.nextInt();
				
				if(B1<arr.length && B1>=0 && B2<arr.length && B2>=0 && arr[B1]!=null && arr[B2]!=null)
				{
					System.out.println(arr[B1].calculateDistance(arr[B2]));
				}
				else
				{
					System.out.println("Enter index greater than 0 and less than "+arr.length);
					
				}
				break;
			case 5:
				   exit=true;
			default:
				System.out.println("Enter valid Input");
					
			}
		}
		
	}

}
