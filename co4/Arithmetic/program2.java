package Arithmetic;
import java.util.*;



public class program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num1:");
		double num1=sc.nextDouble();
		System.out.println("enter the num2:");
		double num2=sc.nextDouble();
		Addition sum=new Addition();
		double addition=sum.calculate(num1,num2);
		System.out.println("sum"+sum.calculate(num1, num2));
		Substraction difference=new Substraction();
		double substraction=difference.calculate(num1,num2);
		System.out.println("difference"+difference.calculate(num1,num2));
		Multiplication product=new Multiplication();
		double multiplication=product.calculate(num1, num2);
		System.out.println("product"+product.calculate(num1,num2));
		Division division=new Division();
		double quotiant=division.calculate(num1, num2);
		System.out.println("quotiant"+division.calculate(num1, num2));
		
		

	}

}
