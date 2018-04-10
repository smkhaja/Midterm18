package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue=new LinkedList<>();
		queue.add("PA");
		queue.add("CA");
		queue.add("WA");
		queue.add("FL");
		queue.add("TX");
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.element());

//using iterator
		Iterator its= queue.iterator();
		while(its.hasNext()){
			System.out.println(its.next());
		}
		queue.remove();
		System.out.println("after removing one element:");
		for (String s:queue){
			System.out.println(s);
		}

	}

}
