package org.tnsif.queuedemo;
//program to demonstrate PriorityQueue
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer>obj=new PriorityQueue();
		//add and offer method is used to insert and elements
        obj.offer(13);
        obj.add(55);
        obj.add(91);
        obj.add(15);
        System.out.println("queue elements are"+obj);
        obj.remove();
        System.out.println("queue elements are"+obj);
        /*obj.remove(); 
        obj.remove();
        obj.remove();
        obj.remove();
        obj.remove();
        obj.poll();
        obj.poll();
        obj.poll();
        obj.poll();
        obj.poll();*/
        obj.remove();
        System.out.println("queue elements are"+obj);
        System.out.println("queue elements are"+obj.peek());
        System.out.println("queue elements are"+obj.element());
	}

}
