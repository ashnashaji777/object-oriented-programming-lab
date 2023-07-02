package Collectionframes;
import java.util.HashMap;
import java.util.TreeMap;

public class program18 {

	public static void main(String[] args) {
		//create a hashmap
		HashMap<String,Integer>hashmap=new HashMap<>();
		hashmap.put("ashna",12);
		hashmap.put("joshna",23);
		hashmap.put("faiz",18);
		hashmap.put("naina",26);
		hashmap.put("aswin",13);
		System.out.println("hashmap:"+hashmap);
		//create treemap
		TreeMap<String,Integer>treemap=new TreeMap<>(hashmap);
		//dispaly treemap
		System.out.println("treemap:"+treemap);
		

	}

}
