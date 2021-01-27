package com.javaex.basic.reftype;

public class StringEx {

	public static void main(String[] args) {
		//	문자형 선언
		String str;	//	선언
		str = "Java";	//	Literal
		String str2 = "Java";
		String str3 = new String("Java");
		
		//	세 변수는 같은 값(주소)을 가지고 있다
		//	객체의 경우, ==은 주소의 비교
		System.out.println(str == str2);
		System.out.println(str2 == str3);
		
		//	값을 비교 : equals
		System.out.println(str.equals(str3));

		//	String 타입에 관한 자세한 내용은 api 편에서 정리
	}

}
