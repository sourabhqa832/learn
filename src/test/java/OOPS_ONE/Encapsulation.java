package OOPS_ONE;

public class Encapsulation {
	
	//Encapsulation means wrapping up of data into a single unit.
	//Java class itself is an example of encapsulation
	
	//Constructor is used to initialize the data members
	
	public Encapsulation(){
		
		//we have initialized data member as below
		a=10;
		b=5;
		str="Sourabh";
		v=true;
		
	}
	
	//Data members which are declared but not initialized
	private int a;
	private int b;
	private String str;
	private boolean v;
	
	
	void method1() {
		
		System.out.println(a);
		System.out.println(b);
	}
/*	//Member functions
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} */

}
