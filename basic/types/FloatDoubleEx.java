package com.javaex.basic.types;

import java.math.BigDecimal;

public class FloatDoubleEx {
	public static void main(String[] args) {
		float floatVar = 3.14159F; 
		double doubleVar = 3.14159;
		
		// 정밀도 체크
		doubleVar = 0.1234567890123456789;
		floatVar = 0.1234567890123456789f;
		
		System.out.println("float:" + floatVar);
		System.out.println("double:" + doubleVar);
		
		//	e 사용한 표현
		int intVar = 3000000;
		doubleVar = 3E6; //	 3 * 10 ^ 6
		floatVar = 3E-6f; //	3 * 10 ^ -6
		
		System.out.println("int:" + intVar);
		System.out.println("float:" + floatVar);
		System.out.println("double:" + doubleVar);
		
		//	부동소수점 계산의 유의점
		//	float, double은 정밀도를 포기하고 표현 범위를 넓힌 것이니
		//		정밀한 실수 처리를 위해서는 다른 방법을 사용한다
		System.out.println(0.1 * 3);
	}
}
