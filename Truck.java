public class Truck extends Vehicle {
     double maxLoadCapacity;
     public Truck(String brand,String model, int year, double maxLoadCapacity)
     {
    	 super(brand,model,year);
    	 this.maxLoadCapacity=maxLoadCapacity;
     }
     void startEngine()
     {
    	 System.out.println("Truck’s engine started running." );
     }
     void displayInfo()
     {
    	 System.out.println("Truck details");
    	 System.out.println("brand = " +brand);
    	 System.out.println("model = " +model);
    	 System.out.println("year = " +year);
    	 System.out.println("maxload= " +maxLoadCapacity +"kg" );
     }
	 @Override
	 void displayinfo() {
		
	 }
}
