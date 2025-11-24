
public class EvenCount
{
	public static void main(String[] args)
	{
		int[] arr = { 20, 3, 76, 17, 85, 10, 90, 48 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] % 2 == 0) 
			{
				count++;
			}
		}
		System.out.println("Total even are :" + count);

	}

}
