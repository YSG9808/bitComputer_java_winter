package com.javaex.basic.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		//	System.out.print : 개행 안함
		//	System.out.println	: 개행 함
		//	System.out.printf	: 형식 지정 문자열 출력 -> 이것은 나중에 String.format에서 정리
		
		System.out.print("Hello ");
		System.out.println("Java");
		
		String str1 = "Hello";
		String str2 = "Java";
		
		System.out.println(str1 + " " + str2);
		
		//	이스케이프 문자
		System.out.println("Hello\nJava"); // 강제 개행
		System.out.println("Hello\tJava"); // 탭문자
		System.out.println("Hello, \"Java\"");
		System.out.println("\\ 역슬래시");
		
		String dir = "D:\\javastudy\\eclipse";
	}

}
