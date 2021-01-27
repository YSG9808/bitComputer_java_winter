package com.javaex.basic.operators;

public class LogicOperEx {
	//	비교 연산과 논리 연산의 결과는 항상 boolean
	public static void main(String[] args) {
		int n1 = 7;
		int n2 = 3;
		
		//	비교 연산자 : >, >=, <, <=, ==, !=
		System.out.println(n1 > n2);
		System.out.println(n1 == n2);	//	같다
		System.out.println(n1 != n2);	//	같지 않다
		
		//	논리연산 : AND(&&), OR(||), NOT(!)
		//		-> 논리 연산은 집합의 개념을 떠올리도록 하자
		int n3 = 5;
		
		//	n3는 0 초과, 10 미만의 값인가?
		//		조건 1: n3 > 0
		//		조건 2: n3 < 10
		//		조건 1 and 조건 2
		
		boolean r1 = n3 > 0; //	조건 1 점검
		boolean r2 = n3 < 10;	//	조건 2 점검
		//	위 두 개의 조건을 조합해야 한다
		boolean r1AndR2 = r1 && r2;	
		System.out.println("r1 && r2 => " + r1AndR2);
		System.out.println(n3 > 0 && n3 < 10);
		
		//	n3은 0이하이거나, 10 이상의 값인가?
		boolean r3 = n3 <= 0;
		boolean r4 = n3 >= 10;
		boolean r3OrR4 = r3 || r4;
		
		System.out.println("r3 || r4 => " + r3OrR4);
		System.out.println(n3 <= 0 || n3 >= 10);
		
		//	not -> 논리 부정
		boolean rNot = !(n3 > 0 && n3 < 10);
		//	이것은 n3 > 0 && n3 < 10 논리값의 여집합이다.
		System.out.println("not:" + rNot);
		System.out.println(!(n3 > 0 && n3 < 10));
		/*
		System.out.println((n1 > n2) && (n1 < n2)); // 두 조건을 모두 만족해야 true
		System.out.println((n1 > n2) || (n1 < n2)); //	두 조건 중 하나만 만족하면 true
		System.out.println(!((n1 > n2) && (n1 < n2)));
		*/ 
	}
}
