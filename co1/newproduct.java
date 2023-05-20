package sample;
import java.util.*;
class product1{
	int pcode;
	String pname;
	int price;
	
	
}

public class newproduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		product1 obj1=new product1();
		product1 obj2=new product1();
		product1 obj3=new product1();
		System.out.println("enter the details of product 1");
		obj1.pcode=sc.nextInt();
		obj1.pname=sc.next();
		obj1.price=sc.nextInt();
		System.out.println("enter the details of product 2");
		obj2.pcode=sc.nextInt();
		obj2.pname=sc.next();
		obj2.price=sc.nextInt();
		System.out.println("enter the details of product 3");
		obj3.pcode=sc.nextInt();
		obj3.pname=sc.next();
		obj3.price=sc.nextInt();
		if(obj1.price<obj2.price&&obj1.price<obj3.price)
			System.out.println(obj1.pname+"has lower price"+obj1.price);
		else if(obj2.price<obj1.price&&obj2.price<obj3.price)
			System.out.println(obj2.pname+"has lower price"+obj2.price);
		else
			System.out.println(obj3.pname+"has lower price"+obj3.price);
			
		
		
		}

}
