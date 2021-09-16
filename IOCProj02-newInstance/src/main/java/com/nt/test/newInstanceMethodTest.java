package com.nt.test;

public class newInstanceMethodTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//load classes
		Class c1 = Class.forName(args[0]);
		Class c2 = Class.forName(args[1]);
		
		//create the objects for loaded classes
		Object obj1 = c1.newInstance();
		Object obj2 = c2.newInstance();
		
		System.out.println("C1: "+obj1.toString());
		System.out.println("C2: "+obj2.toString());
	}

}
