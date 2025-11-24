
public class GreaterNextNumber
{
//find and display that number which is greater than next number
	public static void main(String[] args)
	{
		int[] arr = { 121, 3, 76, 120, 85, 10, 90, 48 };
		int n = arr.length-1;
		for (int i = 0; i < n; i++) {
			if (arr[i] > arr[i + 1]) {
				System.out.println(arr[i]);
			}
		}

	}

}
