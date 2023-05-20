package sample;


import java.util.Scanner;

public class program8 {
    private String str1;

    public program8(String str1) {
        this.str1 = str1;
    }

    public void reverse() {
        StringBuilder result = new StringBuilder(str1);
        String strres = result.reverse().toString();
        System.out.println(strres);
    }

    public void length() {
        System.out.println("Length of the string: " + str1.length());
    }

    public void concatination() {
        System.out.println("Enter the second word");
        Scanner sc = new Scanner(System.in);
        String str2 = sc.next();
        System.out.println(str1 + " " + str2);
    }

    public void uppercase() {
        String upper = str1.toUpperCase();
        System.out.println(upper);
    }

    public void lowercase() {
        String lower = str1.toLowerCase();
        System.out.println(lower);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        program8 obj = new program8(str);
        int c;
        do {
        	
        System.out.println("Enter your choice");
        System.out.println("1. Reverse the string \n 2:length of the string \n 3: concatenate the strings \n 4: string to uppercase \n 5:string to lowercase");
        
         c = sc.nextInt();
        switch(c) {
            case 1: obj.reverse(); break;
            case 2: obj.length(); break;
            case 3: obj.concatination(); break;
            case 4: obj.uppercase(); break;
            case 5: obj.lowercase(); break;
            default: System.out.println("Wrong choice");
        }
        }while(c!=0);
    }
}