
public class Practice5 {

	public static void main(String[] args) {
		int [] arr = {10,20,5,4,19,14,100,6,34};
		int n= arr.length-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>arr[i+1])
			{
				System.out.println(arr[i]);
			}
		}

	}

}
