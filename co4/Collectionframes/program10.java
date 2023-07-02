package Collectionframes;
import java.util.*;

public class program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();//create arraylist
		list.add("ashna");
		list.add("joshna");
		list.add("devika");
		list.add("saniya");
		list.add("ashna");// add elements to arraylist
		
		Iterator<String>itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		int size=list.size();
		System.out.println("size of the arraylist:"+size);//give the size of the arraylist
		
		System.out.println("arraylist:"+list);
		
		String element=list.get(2);
		System.out.println("element at index2:"+element);//access an element by index
		
		int index=list.indexOf("devika");
		System.out.println("index of devika:"+index);
		//find index of an element
		
		boolean contains=list.contains("saniya");
		System.out.println("contains 'saniya'?"+contains);//check if arraylist contains a specific element
		
		boolean removed=list.remove("joshna");
		System.out.println("removed 'joshna':"+removed);//remove an element by value
		
		String removedElement=list.remove(0);
		System.out.println("removed element at index 0:"+removedElement);//remove an element by index
		
		list.clear();
		System.out.println("cleared arraylist:"+list);//clear arraylist
		
		

	}

}
