package co3;
import java.util.*;
import java.lang.Math;
interface Shapes{
	double area();
	double perimeter();
}
class Circle1 implements Shapes{
	double radius;
	Circle1(double radius){
		this.radius=radius;
	}
	public double area() {
		return(Math.PI*this.radius*this.radius);
	}
	public double perimeter() {
		return(2*Math.PI*this.radius);
		
	}
	
}
class Rectangle implements Shapes{
	double length;
	double breadth;
	Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public double area() {
		return(this.length*this.breadth);
	}
	public double perimeter() {
		return(2*(this.length+this.breadth));
	}
	
}

public class program6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("enter choice\n 1.circle\n 1. rectangle");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter the radius of the circle");
				double radius=sc.nextDouble();
				Circle1 circle=new Circle1(radius);
				System.out.println("area of circle:"+circle.area());
				System.out.println("perimeter of circle:"+circle.perimeter());
				break;
			case 2:
			System.out.println("enter the length of ractangle");
			double length=sc.nextDouble();
			System.out.println("enter the breadth of ractangle");
			double breadth=sc.nextDouble();
			Rectangle rectangle=new Rectangle(length,breadth);
			System.out.println("area="+rectangle.area());
			System.out.println("perimeter="+rectangle.perimeter());
			break;
			default:
				System.out.println("wrong choice");
				
			
			
			
				
			}
			
				
			}while(choice!=0);
		

	}

}
