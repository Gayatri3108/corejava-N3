package org.tnsif.setdemo;
//program to demonstrate on hashed and linked hash set
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class SetDemo {

	public static void main(String[] args) {
		Set<Object>obj1=new HashSet<>();
		//set1
		//hash set will print the elements in unorder wise
        obj1.add(11);
        obj1.add("gayatri");
        obj1.add(78.9f);
        System.out.println("set1 elements are:"+obj1);
       //set2
       //hash set will print the elements in order wise
        Set<Object>obj2=new LinkedHashSet<>();
        obj2.add(11);
        obj2.add("gayatri");
        obj2.add(78.9f);
        System.out.println("set2 elements are:"+obj2); 
        System.out.println(obj1.equals(obj2)); 
	}

}
