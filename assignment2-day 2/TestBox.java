/*
Create another class : TestBox --for  UI.
Add psvmain(..){...}
Use scanner --to accept box dims from user, create box instance.
display its details & volume.
*/
import java.util.Scanner;
class TestBox
{//USES-A relationship
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Box b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());	
		Box b2=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		if(b1.isEqual(b2))
			System.out.println("Boxes are  Equal");
		else
			System.out.println("Boxes are not equal");
	
		sc.close();
	}
}