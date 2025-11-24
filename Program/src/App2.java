
public class App2 {

	public static void main(String[] args) {
		int[]arr = new int[] {10,20,30,40,50,60};
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{
			if (i==0)
				System.out.print(arr[i]);
			else 
				System.out.print(", "+arr[i]);
		}
	        	System.out.print("]");
	}

}
