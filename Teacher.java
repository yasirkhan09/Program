public class Teacher extends Person {
 private String qualification;
 private int salary;
 public Teacher() {} 
 public Teacher(int id,String name, String phone, String dob,String qualification,int salary)
 {
	 super(id,name,phone,dob);
	this.qualification=qualification;
	this.salary=salary;
 }
 public String getQualification() 
 {
	return qualification;
 }
 public void setQualification(String qualification)
 {
	this.qualification = qualification;
 }
 public int getSalary() 
 {
	return salary;
 }
 public void setSalary(int salary) 
 {
	this.salary = salary;
 }
   public void displayTeacherDetails()
   {
	   System.err.println("Details of Teacher:");
	   System.out.println("******************");
	   super.display();
	   System.out.println("Qualification:"+qualification);
	   System.out.println("Salary:"+salary);
	   
   }

}
