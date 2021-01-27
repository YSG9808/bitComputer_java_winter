package com.javaex.oop.staticmember;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		//	new 호출 불가
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
