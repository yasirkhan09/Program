
public class SwapArithmetic {
	public static void main(String [] args)
	{
	int a=10;
	int b=20;
	System.out.println("Befor swapping:");
	System.out.println("a="+a);
	System.out.println("b="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("\nAfter swapping:");
	System.out.println("a="+a);
	System.out.println("b="+b);
  }
 }
