package co4programs;


import java.util.Stack;

public class program8 {
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();

       
        stack.push("JAVA");
        stack.push("C++");
        stack.push("HTML");

       
        System.out.println("Elements in the stack:");
        for (String element : stack) {
            System.out.println(element);
        }

      
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

     
        System.out.println("Elements in the stack after popping:");
        for (String element : stack) {
            System.out.println(element);
        }

    }
}

