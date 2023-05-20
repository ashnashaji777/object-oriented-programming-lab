package sample;
import java.util.*;

class num{
int r1;
int i1;
int r2;
int i2;
}

public class program3 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

num no = new num();
System.out.print("Enter the real part of first complex no:\n");
no.r1=sc.nextInt();
System.out.print("Enter the imaginary part of first complex no:\n");
no.i1=sc.nextInt();
System.out.print("Enter the real part of second complex no:\n");
no.r2=sc.nextInt();
System.out.print("Enter the imaginary part of second complex no:\n");
no.i2=sc.nextInt();

System.out.printf("First complex number  = %d + %di\n", no.r1,no.i1);
System.out.printf("Second complex number = %d + %di\n", no.r2,no.i2);

System.out.print("Complex number after addition = "+(no.r1+no.r2)+" + i"+(no.i1+no.i2));

}

}
