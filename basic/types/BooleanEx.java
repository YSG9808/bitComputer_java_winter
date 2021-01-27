package com.javaex.basic.types;

public class BooleanEx {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		boolean result;
		
		int var1 = 3;
		int var2 = 5;
		
		result = var1 < var2;	//	비교 연산 or 논리연산을 수행하면 논리 값이 나온다
		
		System.out.println(var1 + "<" + var2 
				+ "=" +result);
	}
}
