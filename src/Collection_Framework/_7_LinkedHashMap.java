package Collection_Framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class _7_LinkedHashMap {
	public static void main(String[] args) {
		Map<Integer,String> map = new LinkedHashMap<>();
		map.put(1, "Souvik");
		map.put(8, "Sourav");
		map.put(7, "Rahul");
		map.put(5, "Ram");
		//Order of insertion is maintain
		System.out.println(map);
	}
}
