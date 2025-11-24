
public class Practice4 {

	public static void main(String[] args) {
		
		int [] arr = {1,4,5,10,89,5,1,2,5,8,7,10,3,2,1,5,6,7,8,9,};
		
	    int num=5;
	    int count =0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]==num)
	    		count++;
	    }
	    if(count>0)
	    System.out.println(count+" number exist");
	    else
	    {
	    	System.out.println(num +" number does not exist");
	    }
	    
	    
}
}
