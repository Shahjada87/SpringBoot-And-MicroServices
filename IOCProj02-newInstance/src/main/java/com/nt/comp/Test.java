package com.nt.comp;

public class Test {
	private int a = 10;
	private String b ="hello";
	
	public Test() {
		System.out.println("Test:: 0-Param Constructor");
	}
	
	public Test(int a, String b) {
		System.out.println("Test::2-Param Constructor");
	}
	
	//Alt + shift +s , s
	
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
}
