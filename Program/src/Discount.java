
public class Discount {

		static void Calculatediscount(int amount) {
			
	        double discount = 0.0;
	        double paybleamount = 0.0;
	        if (amount>=10000)
	        {
	        	discount = amount*.20;
	        	
	        }
	        else 
	        {
	        	if (amount>=8000 )
	        	{
	        		discount = amount*.15;
	        	}
	        	else 
	        	{
	        		if(amount>=5000 )
	        		{
	        			discount = amount*.10;
	        	    }
	                   else 
	        	     {
	        	       if (amount>=2000 )
	        	       {
	        		     discount = amount*.5;
	        	       }
	        	else  
	        	{
	        	    System.out.println("Sorry no discount :");
	        	    return;
	        	}
	        	
	        }
		}

	}     
	    paybleamount = amount - discount;
	    System.out.println("total amount="+amount);
	    System.out.println("total discount is :"+discount);
	    System.out.println("amount to be paid :"+paybleamount);
	}
	     public static void main(String []args)
	{
		Calculatediscount(5000);
	}
	}
	 
      