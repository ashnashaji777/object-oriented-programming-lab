package Collectionframes;
import java.util.*;
public class program14 {

	public static void main(String[] args) {
		Deque<String>dq=new ArrayDeque<String>();
		dq.addFirst("Apple");
		dq.addFirst("orange");
		dq.addLast("mango");
		dq.addLast("grapes");
		System.out.println("deque:"+dq);
		
		dq.removeFirst();
		System.out.println("deque:"+dq);
		dq.removeLast();
		System.out.println("deque:"+dq);
		//String removeFirst=dq.removeFirst();
				//System.out.println("removed first element:"+removeFirst);
				//String removeLast=dq.removeLast();
		//System.out.println("removed last element:"+removeLast);

	}

}
