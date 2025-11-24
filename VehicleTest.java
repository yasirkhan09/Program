
public class VehicleTest {

	public static void main(String[] args) {
		 Vehicle[] v = new Vehicle[3];
		 v[0] = new Car("toyoto","Innova",2018,4);
		 v[1] = new Bike("Yamaha", "R15", 2020, "Sports");
	     v[2] = new Truck("Tata", "Ultra", 2015, 5000);
	     int currentYear = 2025;
	     for(Vehicle show : v)
	     {
	    	 show.startEngine();
	    	 show.displayinfo();
	   System.out.println("Vehicle Age: " + show.calculateAge(currentYear) + " years");
	   System.out.println("-----------------------------");
	   }


	}

}
