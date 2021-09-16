package com.nt.test;

import java.lang.reflect.Constructor;

public class newInstanceMethodTest1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//load classes
		Class c1 = Class.forName(args[0]);
		
		
		// get all constructor of loaded class
		Constructor cons[] = c1.getDeclaredConstructors();
		
		// DYnamic object creation using 0-Param constructor
		Object obj1 = cons[0].newInstance();
		System.out.println(obj1);
		System.out.println("..........");
		
		// DYnamic object creation using 2-Param constructor
		Object obj2 = cons[1].newInstance(100,"india");
		System.out.println(obj2);
		
	}

}
