
package co3;

import java.util.Scanner;

interface total

{

	double calculate();

}

class product implements total{

	public static char[] pro;

	int id;

	String name;

	double quantity;

	double unitprice;

	product(int i, String n,double q , double up){

		id=i;

		name=n;

		quantity=q;

		unitprice =up;

		

	}

		public double calculate() {

			return quantity * unitprice;

		}}

public class program7 {

      public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.println("enter the date" );

		String date = sc.next();

		int i;

		int n;

		System.out.println("enter the no of product");

		n=sc.nextInt();

		double total;

		double totalamount=0;

		product[] pro = new product[n];

		for(i=0;i<n;i++)

		{

		System.out.println("enter the details of product" + (i+1));

		System.out.println("enter the product id ");

		int id = sc.nextInt();

		System.out.println("enter the product name ");

		String name = sc.next();

		System.out.println("enter the product quantity ");

		double quantity = sc.nextDouble();

		System.out.println("enter the product unitprice ");

		double unitprice = sc.nextDouble();

	    pro[i] = new product(id , name, quantity , unitprice);

		total = pro[i].calculate();

		totalamount+=total;

	    }

		System.out.println("Date :" + date);

        System.out.println("...........................................................................................");

		System.out.println("Id    Name      Quantity      Unitprice  Totalamount");

        for(i=0;i<n;i++) {

        	System.out.println("...........................................................................................");

         	System.out.println(pro[i].id + "\t"  +  pro[i].name  + "\t"    +     pro[i].quantity     + "\t"    +    "         "+      pro[i].unitprice    + "\t"   +                   pro[i].calculate()    +"\n"   );

       }

        System.out.println("...........................................................................................");  	

        System.out.println("Net amount" + "    " +totalamount);

        System.out.println("...........................................................................................");

	}}



