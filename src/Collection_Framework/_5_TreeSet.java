package Collection_Framework;

import java.util.TreeSet;

public class _5_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		//treeSet.add(null); - treeset does not accept null value
		treeSet.add(10);
		treeSet.add(5);
		treeSet.add(14);
		treeSet.add(10);
		treeSet.add(5);
		treeSet.add(2);
		System.out.println("Printing Tree set value : "+treeSet);
	}
}
