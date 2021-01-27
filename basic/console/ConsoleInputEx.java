package com.javaex.basic.console;

import java.util.Scanner;

public class ConsoleInputEx {
	public static void main(String[] args) {
		//	Tip : 객체를 import할 때 - Ctrl + Shift + O
		//	Tip2 : 자동 완성 기능 - Ctri + Space
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이는? ");
		int age = scanner.nextInt();
		
		String name = scanner.next();
		
		System.out.println("Welcome, " + name);
		System.out.println("age: " + age);
		
		scanner.close();// 쓰고 나면 닫아주자
		
	}
}
