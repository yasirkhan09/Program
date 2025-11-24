
public class LargestNo 
{
	public static void main(String[] args) 
	{
		int[] arr = { 21, 3, 76, 120, 85, 10, 90, 48 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] > max) 
			{
				max = arr[i];
			}
		}
		System.out.println("Largest number is :"+max);

	}

}
