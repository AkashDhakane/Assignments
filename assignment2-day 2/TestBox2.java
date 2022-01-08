import java.util.Scanner;
class TestBox2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Box b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());	
		Box newBox=b1.createNewBox(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		b1.getComputedVolume();
		newBox.getComputedVolume();
		System.out.println(b1.getBoxDetails());
		System.out.println(newBox.getBoxDetails());
		sc.close();
	}
}