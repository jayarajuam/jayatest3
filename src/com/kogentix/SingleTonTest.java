package com.kogentix;

public class SingleTonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SignletoDemo.getInstance();
		
		System.out.println("First instance has been created");
		
		SignletoDemo.getInstance();
		
		System.out.println("Second tried");
	}

}
