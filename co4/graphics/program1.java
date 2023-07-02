package graphics;
import java.util.*;
import graphics.Rectangle;
import graphics.Triangle;
import graphics.Square;
import graphics.Circle;

public class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the width");
    	double width=sc.nextDouble();
    	System.out.println("enter the height");
    	double height=sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        
        System.out.println("enter the base");
    	double base=sc.nextDouble();
    	System.out.println("enter the height");
    	double height1=sc.nextDouble();
        Triangle triangle = new Triangle(base,height1);
        System.out.println("Area of triangle: " + triangle.getArea());
        
        System.out.println("enter the side of the square:");
    	double side=sc.nextDouble();
        Square square = new Square(side);
        System.out.println("Area of square: " + square.getArea());
        
        System.out.println("enter the radius");
    	double radius=sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of circle: " + circle.getArea());
    }
}
