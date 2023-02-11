package org.tnsif.abstractiondemo;
//implemented class
public class ButterChicken extends Menu{
	/*implement all the abstract method and abstract class*/
	@Override
       void recipe() {
    	   System.out.print("wash and cook chicken");
       }

	@Override
	void foodType() {
		System.out.println("non veg");
		
	}
}
