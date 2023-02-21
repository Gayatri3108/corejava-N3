package org.tnsif.mapdemo;
//program to demonstrate on hashed map and linked hash map
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class MapDemo {

	public static void main(String[] args) {
		//unordered
		Map<Integer,String>obj=new HashMap<>();
        obj.put(411001, "mg road");//pune
        obj.put(422001, "mg road");//nashik
        System.out.println(obj);
        //ordered
        Map<Integer,String>obj1=new LinkedHashMap<>();
        obj1.put(411001, "mg road");//pune
        obj1.put(422001, "mg road");//nashik
        System.out.println(obj1);
	}

}
