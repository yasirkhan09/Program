
public class Bike extends Vehicle {
	String biketype;
	public Bike(String brand, String model,int year,String biketype)
	{
		super(brand,model,year);
		this.biketype=biketype;
	}
      void startEngine()
      {
    	  System.out.println("Bike engine started.");
      }
      void displayInfo()
      {
    	  System.out.println("display bike details");
          System.out.println("brand = "+brand);
          System.out.println("model = "+model);  
          System.out.println("year = "+year);  
          System.out.println("type = "+biketype);  
      }
	  @Override
	  void displayinfo() {
		
		
	  }
	
}

