public class Student extends Person {
 private String email;
 private String course;
 private int fees;
  public Student() {} 
	public Student(int id,String name, String phone, String dob,String email,String course, int fees)
	{
	    super(id,name,phone,dob);
		this.email=email;
		this.course=course;
		this.fees=fees;
		   
	 }
		
	       public String getEmail()
	       {
	    	   return email;
	       }
	       public void setemail(String email)
	       {
	    	   this.email=email;
	       }
	       public String getCourse()
    	   {
    		   return course;
    	   }
	       public void setCourse(String course)
	       {
	    	   this.course=course;
	       }
	       public int getFees()
	       {
	    	   return fees;
	       }
	       public void setFees(int fees)
	       {
	    	   this.fees=fees;
	       }
		   public void displayStudentDetails()
		   {
			   System.err.println("\nDetails of Student:");
			   System.out.println("******************");
			   super.display();
			   System.out.println("Email:"+email);
			   System.out.println("course:"+course);
			   System.out.println("fees:"+fees);
			   System.err.println("*********END*********");
			   
		   }

		}


