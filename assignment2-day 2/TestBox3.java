import java.util.Scanner;
class TestBox3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dimensions OF First Box");
		Box b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.next());	
		System.out.println("Enter Dimensions Of Second Box")
		Box newBox=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.next());
		if(b1.getComputedVolume()>newBox.getComputedVolume())
			System.out.println(b1.getColor());
			else
				System.out.println(newBox.getColor());
		sc.close();
	}
}