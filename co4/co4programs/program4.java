package co4programs;


import java.util.*;


public class program4 extends Exception {



	public static void main(String[] args) {

	  Scanner sc = new Scanner (System.in);

		

		System.out.println("enter the n");

		int n = sc.nextInt();

	

	    int sum =0;

	   

		System.out.println("enter the numbers");

		for(int i=0;i<n;i++) {

			try {

			int num = sc.nextInt();	

			

			if(num<0) {

				throw new Exception();

			}

			

			

			sum += num;

			}

			catch(Exception e){

				System.out.println("negative numbers are not allowed");

				i--;

			}

	}

		

		

			

	    System.out.println("Sum of numbers" + sum);

		double avg;

		avg =(double) sum / n;

		System.out.println("Average of numbers " + avg);

		

	}



}