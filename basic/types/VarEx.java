package com.javaex.basic.types;

public class VarEx {
	public static void main(String[] args) {
		//	변수 식별자 부여
		//	문자, 숫자, $, _ 
		//	숫자로 시작하면 안됨
		
		//	변수명 관례
		//	관례상 소문자 작성, 단어의 조합이면 뒷 단어의 첫글자 대문자
		/*
		int myAge;	//	선언
		//	초기화
		myAge = 47;
		*/
		int myAge = 47;	//	선언과 할당 동시에
		
//		myAge = 12345678901234567890;
		//	Type 선언된 변수는 다른 타입으로 쓸 수 없음
//		myAge = "마흔일곱";
		
		//	출력
		System.out.println(myAge);
		
		//	한번에 여러 변수를 선언할 때
		int v1 = 10, v2 = 20, v3 = 30;
		
		//	여러 변수에 동시에 같은 값을 할당할 때
		v1 = v2 = v3 = 40;
	}
}
