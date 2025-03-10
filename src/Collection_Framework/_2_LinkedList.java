package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class _2_LinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		//adding values - add() collection method
		list.add(4);
		list.add(null); 
		list.add(5);
		list.add(null);
		list.add(6);
		list.add(8);
		list.add(7);

		//Printing values
		System.out.println(list);
		
		//LinkedList method - 
		//1) addFirst()
		list.addFirst(10);
		System.out.println("After adding element in 1'st position - "+list);
		
		//2) addLast()
		list.addLast(12);
		System.out.println("After adding element in last position - "+list);
		
		//3)removeFirst()
		list.removeFirst();
		System.out.println("After removing element from 1'st position - "+list);
		
		//4) removeLast()
		list.removeLast();
		System.out.println("After removing element from last position - "+list);
		
		//5)getFirst()
		System.out.println("Printing 1'st element of the list : "+list.getFirst());
		
		//6)getLast()
		System.out.println("Printing last element of the list : "+list.getLast());

		// Creating a collection and adding that collection into "list" List
		// addAll() collection method
		List<Integer> tempList = new ArrayList<>();
		tempList.add(1);
		tempList.add(null);
		tempList.add(2);

		list.addAll(tempList);
		System.out.println("Updated List : "+list);

		//Size() collection method
		System.out.println("Size of List : "+list.size());

		//Iterator interface
		Iterator<Integer> itr = list.iterator();
		System.out.println("Printing all list value using Iterator ->");
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

		//Removing one element from list using remove() collection method
		list.remove(3); // need to pass index value
		System.out.println("\nPrinting list after removing 3 index value : ");
		System.out.print(list);

		//Checking if the element present in the list using contains() collection method
		int searchableEle = 0;
		boolean isElePresent = list.contains(searchableEle);
		if(isElePresent) {
			System.out.println("\n"+searchableEle+" present in the list");
		}
		else {
			System.out.println("\n"+searchableEle+" is not present in the list");
		}

		//Checking if the list is empty using isEmpty() collection method
		boolean isEmpty = list.isEmpty();
		System.out.println("Is list Empty : "+isEmpty);

		//Converting collection into Array using toArray() method
		Integer[] arrayEle = list.toArray(new Integer[list.size()]);
		System.out.println("Printing list element after converting to array : ");
		for(Object o : arrayEle) {
			System.out.print(o+" ");
		}
		//Converting list to stream
		System.out.println("\nPrinting all the list element after converting into stream : ");
		Stream<Integer> stream = list.stream();
		stream.forEach(System.out::print);

		//get() method to fetch the indexed element from the list , it's a list interface method
		System.out.println("\nPrinting the 4'th index element from the list : "+list.get(4));

		//Iterator interface
		ListIterator<Integer> listitr = list.listIterator();
		System.out.println("Printing all list value using Iterator ->");
		System.out.println("Printing Forward direction : ");
		while(listitr.hasNext()) {
			System.out.print(listitr.next()+" ");
		}
		System.out.println("\nPrinting backward direction : ");
		while(listitr.hasPrevious()) {
			System.out.print(listitr.previous()+" ");
		}

		//deleting all the list element using clear() collection method
		list.clear();
		System.out.println("\nAfter removing all the list from list : "+list);
		System.out.println("Checking if list is empty : "+list.isEmpty());



	}
}
