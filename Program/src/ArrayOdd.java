
public class ArrayOdd
{
	public static void main(String[] args) 
	{
		int[] arr = { 15, 3, 76, 124, 85, 10, 90, 48 };
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 != 0) {
				System.out.println("Number is odd:" + arr[i]);
			}

		}
	}

}
