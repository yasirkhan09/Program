import java.util.Scanner;
public class ConvertToWord
{
	static String[] x = { " ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
			"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

	public static void ConvertToWord(int num)
	{
		if (num >= 1 && num <= 19) 
		{	
			System.out.println(x[num]);
		} 
		else
		{
			System.out.println("Number out of range (1-19)");
		}
	}
	  public static void main(String [] args)
	  {
		  Scanner sc = new Scanner (System.in);
		  System.out.println("Enter the number:");
		  int number = sc. nextInt();
		  ConvertToWord(number);
	  }

}