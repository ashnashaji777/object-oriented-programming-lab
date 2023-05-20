package sample;

import java.util.Scanner;

public class program8 {
    private String str;

    public program8(String str) {
        this.str = str;
    }

    public void reverse() {
        StringBuilder result = new StringBuilder(str);
        String strres = result.reverse().toString();
        System.out.println(strres);
    }

    public void length() {
        System.out.println("Length of the string: " + str.length());
    }

    public void concatination() {
        System.out.println("Enter the second word");
        Scanner sc = new Scanner(System.in);
        String str2 = sc.next();
        System.out.println(str + " " + str2);
    }

    public void uppercase() {
        String upper = str.toUpperCase();
        System.out.println(upper);
    }

    public void lowercase() {
        String lower = str.toLowerCase();
        System.out.println(lower);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        program8 obj = new program8(str);
        System.out.println("1. Reverse \n 2:length \n 3: concatenate \n 4: uppercase \n 5: lowercase");
        System.out.println("Enter your choice");
        int c = sc.nextInt();
        switch(c) {
            case 1: obj.reverse(); break;
            case 2: obj.length(); break;
            case 3: obj.concatination(); break;
            case 4: obj.uppercase(); break;
            case 5: obj.lowercase(); break;
            default: System.out.println("Wrong choice");
        }
    }
}
