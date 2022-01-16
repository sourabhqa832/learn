package com.english.language_english;

public class DemoOfClass {
	
	int a =10; //premitive data type
	
	public boolean bb = true;
	
	float m = 10;
	
	long l = 5l;
	
	String abc ="Sourabh"; // user defined data type
	
	static int st =1000;
	
	
	public static void method11() {
		
		System.out.println("I am static method");
	}


	public void method1() {
		
		int b =9;
		
		b=4;
				
		System.out.println(a);
		System.out.println(b);
		System.out.println(st);
	}
	
	public String method2() {
		System.out.println(a);
		System.out.println("m2");
		return "sourabh";
	}

	public void method3() {
	
	System.out.println("m3");
	}

	public static void main(String... args) {
		// TODO Auto-generated method stub
		
		System.out.println("ehfsef");
		
		DemoOfClass obj = new DemoOfClass();
		
		
		
		obj.method1();
		int bb = obj.a;
		
		obj.method11();
		
		DemoOfClass.method11(); //Classname.method(); = this is a static method
	//	DemoOfClass.method1(); //Classname.method(); - this method is non static 
		
		
		
		
		
	}
	


}
