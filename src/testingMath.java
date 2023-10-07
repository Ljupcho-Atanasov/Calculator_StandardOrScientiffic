import java.util.Scanner;

public class testingMath 
{
	public static void main (String [] args)
	{
	    Scanner s = new Scanner (System.in);
		double x;
		
		System.out.println("Enter radians");
		x = s.nextDouble();
		
		System.out.println(Math.cos(x));
		System.out.println(Math.sin(x));
		s.close();
	}

}
