package sample;
import java.util.*;
class Circle{
	float radius;
	public Circle(double radius) {
		this.radius=(float)radius;
	}
	public double calculateArea() {
		return Math.PI* radius* radius;
	}
}
class Cylinder extends Circle{
	float height;
	public Cylinder (double radius,double height) {
		super(radius);
		this.height=(float) height;
	}
	public double calculateArea() {
		return 2*super.calculateArea() + 2* Math.PI* getRadius()* height;
	}
	public double getRadius() {
		return radius;
	}
	
}

public class program10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		float rad=sc.nextFloat();
		System .out.println("enter the hieght");
	    float ht=sc.nextFloat();
		Cylinder cylinder=new Cylinder(rad,ht);
		Circle circle=new Circle(rad);
		double area1=circle.calculateArea();
		double area2=cylinder.calculateArea();
		System.out.println("area of circle=" + area1);
		System.out.println("area of cylinder =" + area2);
		
		

	}

}
