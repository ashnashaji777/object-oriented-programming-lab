package Collectionframes;
import java.util.*;

public class program16 {

	public static void main(String[] args) {
		HashSet<String>set1=new HashSet<String>();
		set1.add("ashna");
		set1.add("joshna");
		set1.add("saniya");
		set1.add("deva");
		
		System.out.println("first Hashset:"+set1);
		HashSet<String>set2=new HashSet<String>();
		set2.add("aswin");
		set2.add("arjun");
		set2.add("faiz");
		System.out.println("second Hashset:"+set2);
		boolean isEqual=set1.equals(set2);
		System.out.println("are the Hashsets are equal?"+isEqual);

	}

}
