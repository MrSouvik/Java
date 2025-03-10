package Collection_Framework;

import java.util.HashSet;

public class _3_HashSet {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(12);
		hashSet.add(11);
		hashSet.add(11);
		hashSet.add(10);
		hashSet.add(5);
		hashSet.add(13);
		hashSet.add(null);
		
		System.out.println("Printing hashSet value : "+hashSet);
	}
}
