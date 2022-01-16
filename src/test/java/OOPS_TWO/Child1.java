package OOPS_TWO;

import OOPS_ONE.Parent;

public class Child1 extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Protected method can be accessed in child class of different package using child class object
		Child1 obj = new Child1();
		obj.method1();
		

	}

}
