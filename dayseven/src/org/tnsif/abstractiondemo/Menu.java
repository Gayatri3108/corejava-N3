package org.tnsif.abstractiondemo;
//program  to demonstrate on abstract class and abstract method
//abstract class
//class cannot be final abstract
public abstract class Menu {
     abstract void recipe();
     abstract void foodType();
     void menuType() {
    	 System.out.println("veg and nonveg");
     }
}
