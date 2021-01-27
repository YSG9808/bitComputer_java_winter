package com.javaex.basic.operators;

public class BitShiftOperEx {
	public static void main(String[] args) {
		// 비트 시프트
		int val = 1;
		
		System.out.println(val);
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val << 1));
		System.out.println(Integer.toBinaryString(val << 4));
		
		System.out.println("----------");
		
		//	우측 비트 시프트
		int val2 = 0b1000;
		
		System.out.println(Integer.toBinaryString(val2 >> 1));
		System.out.println(Integer.toBinaryString(val2 >> 3));
	}
}
