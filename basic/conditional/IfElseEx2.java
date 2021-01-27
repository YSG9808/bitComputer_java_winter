package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1: C, 2: C++, 3: Python, 4: Linux");
		int subject = scanner.nextInt();
		
		if (subject == 1) {
			System.out.println("R101");
		} else if (subject == 2) {
			System.out.println("R202");
		} else if (subject == 3) {
			System.out.println("R303");
		} else if (subject == 4) {
			System.out.println("R404");
		} else {
			System.out.println("관리자에게 문의하세요");
		}
		
		scanner.close();

	}

}
