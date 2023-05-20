package q1;
import java.util.*;
class Employee{
	int empid;
	String name;
	int salary;
	String address;
	Employee (int empid,String name,int salary,String address){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
		
	}
}
class Teacher extends Employee{
	String department;
	String subject;
	Teacher (int empid,String name,int salary,String address,String department, String subject){
		super(empid, name, salary, address);
		this.department=department;
		this.subject=subject;
		
	}
	public void display(){
        System.out.println("Teacher");
      	 System.out.println("empid:"+ empid);
      	 System.out.println("name:"+name);
      	 System.out.println("salary:"+salary);
      	 System.out.println("address:"+address);
      	 System.out.println("subject taught:"+subject);
      	 
       }
}
public class program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of teachers");
        int n = sc.nextInt();
        sc.nextLine();
        Teacher[] tre = new Teacher[n];
        for(int i=0;i<n;i++){
	        System.out.println("enter the details of teacher"+(i+1));
	        System.out.println("enter the empid:");
	        int empid=sc.nextInt();
	        System.out.println("enter the name:");
	        String name=sc.next();
	        System.out.println("enter the salary:");
	        int salary=sc.nextInt();
	        System.out.println("enter the address:");
	        String address=sc.next();
	        System.out.println("enter the department:");
	        String department=sc.next();
	        System.out.println("enter the sbjecttaught:");
	        String subject=sc.next();
	        
	        
	        tre[i]=new Teacher(empid,name,salary,address,department,subject);
        
        }
        System.out.println("details of the teacher");
        for(int i=0;i<n;i++)
        {
        	tre[i].display();
        	 
        	
        }
        
	}

}
