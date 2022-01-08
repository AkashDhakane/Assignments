package tester;
import com.app.geometry.*;
import java.util.*;

public class TestPointArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many Points You want to plot??");
		Point2D arr[]=new Point2D[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter x and Y coordinate of point "+(i+1));
			arr[i]=new Point2D(sc.nextDouble(),sc.nextDouble());
		}
		for(Point2D e:arr)
			System.out.println(e.getDetails());
		sc.close();

	}

}
