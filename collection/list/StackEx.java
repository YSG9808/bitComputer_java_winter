package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		//	스택 선언
		Stack<Integer> stack = new Stack<>();
		
		//	값을 10개 push
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		
		System.out.println(stack);
		
		//	pop을 해 봅시다: 출력 위치를 확인
		System.out.println(stack.pop());
		System.out.println(stack);
		//	peek도 해봅시다
		System.out.println(stack.peek());
		System.out.println(stack);
		/*
		while(true) {
			System.out.println(stack.pop());
		}
		*/
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		
		
		
	}

}
