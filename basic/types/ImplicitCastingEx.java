package com.javaex.basic.types;

//	암시적 형변환 예제
public class ImplicitCastingEx {
	public static void main(String[] args) {
		//	표현 범위가 좁은 자료형 -> 표현 범위가 넓은 자료형
		//	명시적으로 변환하지 않아도 자동으로 변환됨(Promotion)
		byte b = 25;	//	1바이트 정수형
		
		System.out.println(b);
		
		short s = b;	//	2바이트 정수형
		System.out.println(s);
		
		int i = s;	//	4바이트 정수형
		System.out.println(i);
		
		float f = i;
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
		
		char ch = 'A';
//		short s2 = ch;
	}
}
