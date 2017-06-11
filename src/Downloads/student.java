
public class student {
	
	String fname;
	String lname;
	int rollNo;
	
	public student(){
		System.out.println("Object is created");
	}
	
/*	public student(String firstname,String lastname,int roll_number){
		fname=firstname;
		lname=lastname;
		rollNo=roll_number;
		printDetails();
		
	}*/
	
	
	public student(String fname,String lname,int rollNo){
		this.fname=fname;
		this.lname=lname;
		this.rollNo=rollNo;
		printDetails();
		
	}
	
	public student(String fname,int marks,int rollNo){
		this.fname=fname;
		this.lname=lname;
		this.rollNo=rollNo;
		printDetails();
		
	}
	

	
	public void printDetails(){
		System.out.println(fname + " -> " + lname + " -> " + rollNo);
	}
	
	public  static void printMessage(){
		System.out.println("Welcome to selenium");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
