package sinfo;

 import java.util.Scanner;
 import s1.Student;



public class StudentData {

	public static void main(String[] args) {
		
		
		StudentData student = new StudentData(); 
		Scanner scan = new Scanner(System.in);  
		
		 
		Student studenti = new Student();
	
		System.out.println(" ----------Enter Details for Student-----------");
		
		System.out.println("Enter Student Name : ");
		String studentName = scan.nextLine(); 
		studenti.setStudentName(studentName);
		
		System.out.println("Enter age of  "+studenti.getStudentName());
		int age = Integer.parseInt(scan.nextLine()); 
		studenti.setAge(age);
		
		System.out.println("Enter Phone Number of "+studenti.getStudentName());
		String phoneNumber = scan.nextLine(); ; 
		studenti.setPhoneNumber(phoneNumber);
		
		System.out.println("Enter Address of "+studenti.getStudentName());
		String address = scan.nextLine(); 
		studenti.setAddress(address);
		
		student.printStudentDetails(studenti);	
		
			
	}
	
		
	public void printStudentDetails(Student student)
	{
		System.out.println("\n ---- Student Detail-------\n");
		System.out.println("Student Name :"+student.getStudentName());
		System.out.println("Student Age :"+student.getAge());
		System.out.println("Student Number : "+student.getPhoneNumber());
		System.out.println("Student Address :"+student.getAddress());
		
	}
}