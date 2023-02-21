//driver class
//program to demonstrate on user defined objects
package org.tnsif.setdemo;
import java.util.LinkedHashSet;
import java.util.Set;

public class StudentSetExcuter {
	//user defined method
      public static void addStudent(Set<Student>obj) {
    	  Student student1=new Student(101,"gayatri",89.7f);
    	  Student student2=new Student(102,"gayu",90.7f);
    	  Student student3=new Student(103,"rutuja",91.7f);
    	  obj.add(student1);
    	  obj.add(student2);
    	  obj.add(student3);
      }
	public static void main(String[] args) {
		Set<Student>obj=new LinkedHashSet<>();
        addStudent(obj);
        System.out.println(obj);
	}

}
