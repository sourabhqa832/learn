package OOPS_ONE;

import OOPS_TWO.Child1;

public class Child2 extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Protected method can be accessed in child class of different package using child class object
				Child2 obj = new Child2();
				obj.method1();

	}

}
