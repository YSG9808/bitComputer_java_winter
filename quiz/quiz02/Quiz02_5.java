package com.javaex.quiz.quiz02;

public class Quiz02_5 {
	public static void main(String[] args) {
		int num1 = 13579;
		int num2 = 13579;
		
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
		
		int result1 = ++num1 + 1;
		int result2 = num2++ + 1;
		
		System.out.println(result1 == result2 ? "같음": "다름");
		
		System.out.println("num1:" + num1);
		System.out.println("num2" + num2);
	}
}
