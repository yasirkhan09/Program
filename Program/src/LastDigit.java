
public class LastDigit
{
	public static void main(String[] args)
	{
		int[] arr = { 20, 3, 76, 17, 85, 10, 90, 48 };
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("Last digit is :" + arr[i] % 10);
		}

	}

}
