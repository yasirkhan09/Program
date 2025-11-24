
public class MinimumNumber {

	public static void main(String[] args) {
     int [] arr = { 20, 33, 7, 120, 85, 10, 90, 48 };
     int min = arr[0];
     for(int i=0;i<arr.length;i++)
     {
    	 if(arr[i]<min)
    	 {
    		 min=arr[i];
    	 }
     }    System.out.println(min);

	}

}
