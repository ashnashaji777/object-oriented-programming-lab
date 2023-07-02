package Collectionframes;
import java.util.HashMap;
import java.util.Map;

public class program17 {

	public static void main(String[] args) {
		//create map
		Map<String,Integer>map=new HashMap<>();
		map.put("ashna",12);
		map.put("joshna",23);
		map.put("deva",16);
		map.put("fathima",19);
		System.out.println("map:"+map);
		//change the value associated with a key
		map.put("ashna", 7);
		System.out.println("updated value for ashna:"+map.get("ashna"));
		System.out.println("after updating value,map:"+map);
		//remove an element from map
		map.remove("deva");
		System.out.println("map after removing:"+map);
		//check a key exist in the map
		String key="joshna";
		boolean containsKey=map.containsKey(key);
		System.out.println("map contains"+key+"?"+containsKey);
		//check a value exist in the map
		int value=19;
		boolean containsValue=map.containsValue(value);
		System.out.println("map contains"+value+"?"+containsValue);
		

	}

}
