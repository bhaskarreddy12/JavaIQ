package com.designpatterns;

public class SingletonTest {
	public static SingletonTest singletonTest = new SingletonTest();

	public static SingletonTest getInstance() {
		if (singletonTest != null) {
			return singletonTest;
		} else {
			return singletonTest = new SingletonTest();
		}
	}

	private SingletonTest() {
		System.out.println("SingletonTest object created");
	}
	
}
