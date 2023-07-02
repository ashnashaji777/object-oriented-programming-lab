package Collectionframes;
import java.util.*;
public class program13 {

	public static void main(String[] args) {
		PriorityQueue<String>q=new PriorityQueue<String>();
		q.add("ashna");
		q.add("athira");
		q.add("devika");
		q.add("deva");
		q.add("joshna");
		System.out.println("queue:"+q);
		System.out.println("head of the queue:"+q.peek());
		q.poll();
		System.out.println("queue after removing:"+q);

	}

}
