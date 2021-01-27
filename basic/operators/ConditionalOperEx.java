package com.javaex.basic.operators;

public class ConditionalOperEx {
	public static void main(String[] args) {
		//	3항 연산자 (Conditional Operator)
		int a, b;
		a = 10;
		b = 30;
		
		boolean result;
		
		result = a % 2 == 0 ? true: false;
		System.out.println(a + "는 짝수? " + result);
		
		String message;
		int score = 85;
		
		message = (score >= 80) ? "Good" :
							(score < 50) ? "Fail": "Pass";
		System.out.println("Score: " + score 
				+ ", Result: " + message);
	}
}
