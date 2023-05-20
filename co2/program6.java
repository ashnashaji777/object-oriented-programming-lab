package sample;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class program6 {

    void wordSort(String[] word){
        System.out.println("Array before sorting: "+Arrays.toString(word));
        Arrays.sort(word);
        System.out.println("Array after sorting: "+Arrays.toString(word));
    }

    public static void main(String[] args) {
        int n;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of input words: ");
        n=sc.nextInt();
        String[] str= new String[n];
        System.out.println("Enter the words: ");
        for (int i=0;i<n;i++){
            str[i]=sc.next();
        }
        program6 sort=new program6();
        sort.wordSort(str);
    }

}

