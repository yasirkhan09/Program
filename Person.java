public class Person {
	private int id;
	 private String name;
	 private String phone;
	 private String dob;
	 public Person() 
	 {
		 System.out.println("Non-parameterized consturctor");
	 }

	 public Person(int id, String name, String phone, String dob)
	 {
		
		 this.id=id;
		 this.name=name;
		 this.phone=phone;
		 this.dob=dob;
	 }
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getPhone() {
		 return phone;
	 }
	 public void setPhone(String phone) {
		 this.phone = phone;
	 }
	 public String getDob() {
		 return dob;
	 }
	 public void setDob(String dob) {
		 this.dob = dob;
	 }
	 public void display()
	 {
		 System.out.println("ID:"+id);
		 System.out.println("Name:"+name);
		 System.out.println("Phone:"+phone);
		 System.out.println("DOB:"+dob);
	 }
}
