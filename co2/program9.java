package sample;


import java.util.*;

class Employee{
    int eNo;
    int eSalary;
    String eName;
    Employee(int eNo, String eName, int eSalary){
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }
}

public class program9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of employees");
        int n = sc.nextInt();

       
        Employee[] emp = new Employee[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter the details of "+(i+1)+" employee (eNo, eName and eSalary)");
            int num = sc.nextInt();
            String name = sc.next();
            int salary = sc.nextInt();
            emp[i] = new Employee(num,name,salary);
        }

       
        System.out.println();
        System.out.println("Enter the eNo of the employee to display the details:");
        int No = sc.nextInt();  
        boolean flag = false;

       
        for(int i=0; i<n; i++) {
            if (emp[i].eNo == No) {
                flag = true;
                System.out.println("Employee Number: "+emp[i].eNo);
                System.out.println("Employee Name: "+emp[i].eName);
                System.out.println("Employee Salary: "+emp[i].eSalary);
                break;
            }
        }
        if(!flag){
            System.out.println("The data is invalied!!");
        }
    }
}