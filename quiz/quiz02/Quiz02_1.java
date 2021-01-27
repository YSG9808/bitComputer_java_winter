package com.javaex.quiz.quiz02;

public class Quiz02_1 {
	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		char c = 'A';
		
//		a는 짝수입니까? true or false로 출력하세요.
		System.out.println(a + "는 짝수? " + (a % 2 == 0));
//		b는 3의 배수입니까? true or false로 출력하세요.
		System.out.println(b + "는 3의 배수? " + (b % 3 == 0));
//		'a는 짝수이다'와 'b는 3의 배수이다'를 논리곱(AND)으로 연산하여 해당 진위값을 r1 변수에 저장해 봅시다.
		
		boolean r1 = a % 2 == 0 && b % 3 == 0;
//		결과값 r1을 출력해 봅시다.
		System.out.println(r1);
//		c의 4글자 뒤의 문자는 무엇입니까? 결과값을 r2 변수에 저장해 봅시다.
		
		char r2 = (char)(c + 4);
//		결과값 r2를 출력해 봅시다.
		System.out.println(r2);
	}
}
