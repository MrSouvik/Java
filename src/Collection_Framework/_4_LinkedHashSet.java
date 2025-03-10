package Collection_Framework;

import java.util.LinkedHashSet;

public class _4_LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(null);
		linkedHashSet.add(10);
		linkedHashSet.add(5);
		linkedHashSet.add(14);
		linkedHashSet.add(10);
		linkedHashSet.add(5);
		linkedHashSet.add(2);
		System.out.println("Printing Linked Hashset value  : "+linkedHashSet);
		
	}
}
