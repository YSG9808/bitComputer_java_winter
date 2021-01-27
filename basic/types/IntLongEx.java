package com.javaex.basic.types;

public class IntLongEx {
	public static void main(String[] args) {
		//	int 변수의 선언 (4byte)
		int intVar1;	//	선언
		int intVar2;
		
		intVar1 = 2020;	//	초기화
//		intVar2 = 1234567890123;	// out of range : 저장 범위의 초과
		
		System.out.println(intVar1);
		
		//	long 변수의 선언
		long longVar1;
		long longVar2;
		
		longVar1 = 2020;
		longVar2 = 1234567890123L;
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		//	2진수, 8진수, 16진수
		int bin;
		int oct;
		int hex;
		
		bin = 0b1100;	//	2진수 0b
		oct = 072;		//	8진수 0
		hex = 0xFF;		//	16진수 0x
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
}








