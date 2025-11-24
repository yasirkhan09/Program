
      public class Car extends Vehicle {
     	int   numDoors;
     public Car(String brand , String model, int year, int numDoors)
     {
    	 super(brand, model, year);
    	 this.numDoors=numDoors;
     }
        public void startEngine()
        {
        	System.out.println("Car engine started.");
        }
        public void displayInfo()
        {
        	System.out.println("displays car details.");
        	System.out.println("Brand: " + brand);
            System.out.println("model: " + model);
            System.out.println("year: " + year);
            System.out.println("number of doors: " + numDoors);
        }
		@Override
		void displayinfo() {
			
		}
		    
}
