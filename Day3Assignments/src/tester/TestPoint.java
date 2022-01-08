package tester;

import com.app.geometry.*;
import java.util.*;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("p1 :Enter X  And Y Co-ordinates");
		Point2D p1 = new Point2D(sc.nextDouble(), sc.nextDouble());
		System.out.println("p2 :Enter X  And Y Co-ordinates");
		Point2D p2 = new Point2D(sc.nextDouble(), sc.nextDouble());
		System.out.println(p1.getDetails() + p2.getDetails());
		System.out.println(p1.isEqual(p2) ? "P1 and P2 are same" : "P1 and P2 are different");
		if (p1.isEqual(p2)) {
			System.out.println("P1 and P2 are at same Point");

		} else

		{
			System.out.println("Distance between P1 and P2 is : " + p1.calculateDistance(p2));
		}

		sc.close();

	}

}
