
public class Practice3 {
 public static void main(String [] args)
 {
	 int [] arr = {15,3,76,124,85,10,90,48};
	 for (int i=0;i<arr.length;i++)
	 {
		arr[i]+=i+1; 
	 }
	 System.out.println(arr[3]);
	 System.out.println(arr[arr.length-1]);
 }
}
