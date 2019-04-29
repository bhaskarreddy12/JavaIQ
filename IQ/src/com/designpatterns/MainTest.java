package com.designpatterns;

public class MainTest {
	public static void main(String[] args) {
		MainTest1 mainTest1=new MainTest1();
		SingletonTest singletonTest=mainTest1.getObj();
		System.out.println(singletonTest.hashCode());
		
		MainTest2 mainTest2=new MainTest2();
		SingletonTest singletonTest1=mainTest2.getObj();
		System.out.println(singletonTest1.hashCode());


	}
}
