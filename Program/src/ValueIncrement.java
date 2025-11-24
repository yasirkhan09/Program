
public class ValueIncrement
{
	public static void main(String[] args) 
	{
		int[] arr = { 15, 3, 76, 20, 85, 10, 90, 48 };
		for (int i = 0; i < arr.length; i++) 
		{
			
			arr[i] += 1;

		}
		System.out.println(arr[3]);
	}
}
