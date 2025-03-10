package Collection_Framework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _6_HashMap {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		//Put() - map interface method
		map.put("john123", "John");
		map.put("ram123", "Ram");
		map.put("rahim345", "Rahim");
		map.put("ram123", "Ram"); //duplicate entry
		map.put("rahul2", "Rahul");
		
		//get() - map interface method
		System.out.println("Retriving the value for key rahim345 - "+map.get("rahim345"));
		
		//remove() - map interface method
		System.out.println("Printing map values before removing one entry - "+map);
		map.remove("rahul2");
		System.out.println("printing map values after removing entry - "+map);
		
		//size() - map interface method
		System.out.println("Printing the map size  - "+map.size());
		
		//isEmpty() - checking whether map is empty or not
		System.out.println("Is map empty - "+map.isEmpty());
		
		//keySet() - map interface method
		Set<String> keyset = map.keySet();
		System.out.println("Printing key set after converting - "+keyset);
		
		//entrySet() - map interface method
		Set<Entry<String, String>> entryset = map.entrySet();
		System.out.println("printing entry set values - ");
		Iterator iterator = entryset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//values() - map interface method
		Collection<String> values = map.values();
		System.out.println("Printing collection of values - "+values);
		
		
	}
}
