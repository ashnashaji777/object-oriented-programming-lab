package Collectionframes;
import java.util.*;

public class program12 {

	public static void main(String[] args) {
		Stack<String>stack=new Stack<String>();
		stack.push("ashna");
		stack.push("joshna");
		stack.push("deva");
		stack.push("seniya");
		stack.push("fathima");
		System.out.println("stack:"+stack);
		int position=2;
		if(position>=0 && position<stack.size()) {
			stack.remove(position);
			System.out.println("element at position"+position+"removed");
			
		}
		else {
			System.out.println("invalied position");
		}
		System.out.println("stack:"+stack);
		
		
		

	}

}
