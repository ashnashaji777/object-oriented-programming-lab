package sample;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;


public class program7 {
	private String[] arr;

     public  program7(String[] arr)
    {
        this.arr=arr;
    }   
	
	public int search (String key) {
		for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i].equals(key))
            {
                return i;
            }
            
        }
        return -1;
	}

	
	
	
	
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of wordss in an array");
		n=sc.nextInt();
		String[] arr = new String[n];
		System.out.print("enter the words");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}

        program7 array = new program7(arr);
		
		System.out.println("enter the word to be searched" );
		
        String key = sc.next();

        int index = array.search(key);
        
        if(index!=-1) {
        System.out.println("word found at" +index);
        }
        else {
        	System.out.println("word not found");
        }
		
	}

}
