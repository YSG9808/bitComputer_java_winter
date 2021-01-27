package com.javaex.basic.types;

public class ExplicitCastingEx {
	public static void main(String[] args) {
		//	표현 범위가 넒은 자료형 -> 표현 범위가 낮은 자료형으로 변환
		//	강제로 타입을 변환해 주어야 한다. (Casting)
		byte b;
		int i = 2018;
		float f = 123.456f;
		
		
		b = (byte)i;
		
		System.out.println("int " 
					+ i +" -> byte:" + b);
		
		i = (int)f;
		
		System.out.println("float " 
				+ f + " -> int:" + i);
		
	}
}
