package co3;
import java.util.*;
class Person{
	String name;
	String gender;
	String address;
	int age;
	public Person(String name,String gender,String address,int age){
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
		
	}
}
class Employee1 extends Person{
	int empid;
	String cname;
	String quali;
	int salary;
	public Employee1(String name,String gender,String address,int age,int empid,String cname,String quali,int salary){
		super(name,gender,address,age);
		this.empid=empid;
		this.cname=cname;
		this.quali=quali;
		this.salary=salary;
	}
	
}
class Teacher1 extends Employee1{
	String subject;
	String department;
	int tid;
	public Teacher1(String name,String gender,String address,int age,int empid,String cname,String quali,int salary,String subject,String department,int tid){
		super(name,gender,address,age,empid,cname,quali,salary);
		this.subject=subject;
		this.department=department;
		this.tid=tid;
		
		
	}
	public void display() {
		System.out.println("teacher id:"+tid);
		System.out.println("department:"+department);
		System.out.println("subject:"+subject);
		System.out.println("employee id:"+empid);
		System.out.println("company name:"+cname);
		System.out.println("qualification:"+quali);
		System.out.println("salary:"+salary);
		System.out.println("employeename:"+name);
		System.out.println("gender:"+gender);
		System.out.println("address:"+address);
		System.out.println("age:"+age);
	}
}



public class program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of teache:");
		int n=sc.nextInt();
		Teacher1[]tr= new Teacher1[n];
		for(int i=0;i<n;i++){
			System.out.println("enter the details of teacher"+(i+1));
			System.out.println("enter the teacherid:");
			int tid=sc.nextInt();
			System.out.println("enter the department:");
			String department=sc.next();
			System.out.println("enter the subject:");
			String subject=sc.next();
			System.out.println("enter the empid:");
			int empid=sc.nextInt();
			System.out.println("enter the companyname:");
			String cname=sc.next();
			System.out.println("enter the qualification:");
			String quali=sc.next();
			System.out.println("enter the salary:");
			int salary=sc.nextInt();
			System.out.println("enter the name:");
			String name=sc.next();
			System.out.println("enter the gender:");
			String gender=sc.next();
			System.out.println("enter the address:");
			String address=sc.next();
			System.out.println("enter the age:");
			int age=sc.nextInt();
			tr[i]= new Teacher1(name,gender,address,age,empid,cname,quali,salary,subject,department,tid);
			
			
			
			
			
		}
		for(int i=0;i<n;i++) {
			tr[i].display();
		}
		
		
	}

}
