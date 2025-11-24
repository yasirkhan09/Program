
public class EvenNumber 
{
	public static void main(String[] args)
	{
		int[] arr = { 20, 3, 76, 17, 1, 85, 10, 90, 48 };
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0) {
				System.out.println("Number is even :" + arr[i]);
			}
		}

	}

}
