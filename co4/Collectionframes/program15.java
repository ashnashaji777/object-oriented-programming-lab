package Collectionframes;
import java.util.*;

public class program15 {

	public static void main(String[] args) {
		Set<String>set=new LinkedHashSet<String>();
		set.add("apple");
		set.add("orange");
		set.add("mango");
		set.add("grapes");
		set.add("apple");
		System.out.println("linkedhashset:"+set);
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		String element="apple";
		boolean contain=set.contains(element);
		System.out.println("set contains"+element+"?"+contain);
		
		set.remove("orange");
		System.out.println("linkedhashset:"+set);
		
		

	}

}
