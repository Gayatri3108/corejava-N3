package org.tnsif.staticdemo;

public class StaticVariableExcuter {

	public static void main(String[] args) {
		StaticVariable s=new StaticVariable("nia lopex");
		System.out.println(s);
		// use classname.variablename to print static variable
        System.out.println(StaticVariable.companyName);
	}

}
