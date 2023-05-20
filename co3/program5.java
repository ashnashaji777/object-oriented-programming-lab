package co3;
import java.util.*;
class Student{
	int sid;
	String name;
	String dept;
	public Student(int sid,String name,String dept) {
		this.sid=sid;
		this.name=name;
		this.dept=dept;
	}
}
class Sports extends Student{
	String item;
	String coach;
	int score;
	public Sports(int sid,String name,String dept,String item,String coach,int score) {
		super(sid,name,dept);
		this.item=item;
		this.coach=coach;
		this.score=score;
	}
}
class Result extends Sports{
	public Result(int sid,String name,String dept,String item,String coach,int score) {
		super(sid,name,dept,item,coach,score);
		
	}
	void display(){

    	System.out.println("\n Student id   " + sid + "\nstudent name   " +  name + " \nStudent department   " + dept + "\nsport item   " + item + "\n sport coach   " + coach + "\nstudent score  " + score );

	}
}
public class program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the no of students");

		int n=sc.nextInt();

		Result[] res = new Result[n];

		for(int i =0; i<n ;i++) {

       		System.out.println("enter the details of student" + (i+1));

			System.out.println("enter the  student id");

			int sid=sc.nextInt();

			System.out.println("enter the  student name ");

			String name=sc.next();

			System.out.println("enter the  student dept");

			String dept=sc.next();

			System.out.println("enter the  sport item");

			String item=sc.next();

			System.out.println("enter the  sport coach");

			String coach=sc.next();

			System.out.println("enter the  student score");

			int score=sc.nextInt();

			res[i] = new Result (sid,name , dept,item,coach,score);

		}

		for (int i=0;i<n;i++) {

			res[i].display();

		}
		

	}

}
