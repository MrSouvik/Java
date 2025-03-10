package Collection_Framework;

import java.util.TreeMap;
import java.util.Map;

public class _8_TreeMap {
	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<>();
		map.put(1, "Souvik");
		map.put(8, "Sourav");
		map.put(7, "Rahul");
		map.put(5, "Ram");
		//Store the data in natural order (ascending order)
		System.out.println(map);
		
		//firstKey() - return first lowest key  - treemap method
		System.out.println("Returning first lowest key - "+map.firstKey());
		
		//lastKey() - return the last highest key - treemap method
		System.out.println("Returning last highest key - "+map.lastKey());
	}
}
