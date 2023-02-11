package org.tnsif.abstractiondemo;

public class AbstractionExcuter {

	public static void main(String[] args) {
		ButterChicken b=new ButterChicken();
		//we cant initiate the abstract class
		//Menu m=new Menu();
		b.foodType();
		b.menuType();
        b.recipe();
	}
}
