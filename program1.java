package com.java_basics;

public class program1 {
	int pincode = 500601; // instance variable(non static field)
	char taluk = 's';
	String name = "mani";
	
	static int id = 900;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pincode;
		System.out.println("program");
		pincode = 584128;
		pincode = 560107;
		System.out.println(new program1().name);
		program1 my = new program1();
		System.out.println(my.taluk);
		System.out.println(pincode);
		test2(20);
	}

	public static void test1() {
		System.out.println(id);
	}
	public static void test2(int height) {
		System.out.println(height);
	}
}
