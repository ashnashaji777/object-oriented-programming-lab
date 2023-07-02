package Collectionframes;
import java.util.*;

public class program11 {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();//create linkedlist
		list.add("ashna");
		list.add("joshna");
		list.add("aswin");
		list.add("faiz");
		list.add("arjun");
		Iterator<String>itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("linkedlist:"+list);//linkedlist before removal
		list.clear();
		System.out.println("removed linkedlist:"+list);//linkedlist after removal
		
		
		

	}

}
