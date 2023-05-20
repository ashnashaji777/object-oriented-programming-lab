package ashnasample;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int a=obj1.nextInt();
		System.out.println("enter the number of coloms");
		int b=obj1.nextInt();
		int matrix1[][]=new int[a][b];
		System.out.println("enter the elemets for materix1");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				matrix1[i][j]=obj1.nextInt();
			}
		}
		System.out.println("matrix1");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println();
		}
		int matrix2[][]=new int[a][b];
		System.out.println("enter the elemets for materix2");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				matrix2[i][j]=obj1.nextInt();
			}
		}
		System.out.println("matrix2");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.println();
		}
		int matrix3[][]=new int[a][b];
		System.out.println("enter the elemets for materix3");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
				
			}
		
		}
		System.out.println("matrix3");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(matrix3[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		

	}

}
