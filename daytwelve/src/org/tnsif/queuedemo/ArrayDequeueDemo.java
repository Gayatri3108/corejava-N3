package org.tnsif.queuedemo;
import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		Deque<String>obj=new  ArrayDeque<>();
        obj.add("vaibhav");
        obj.add("vrush");
        obj.addLast("saurabh");
        System.out.println("array deueue elements are:"+obj);
        //to extract the elements in queue
        for(String itr:obj) {
        	System.out.print(itr+"");
        }
        System.out.println();
        obj.remove();
        System.out.println("array deueue elements are:"+obj);
        obj.removeFirst();
        System.out.println("array deueue elements are:"+obj);
        obj.removeLast();
        System.out.println("array deueue elements are:"+obj);
	}
}
