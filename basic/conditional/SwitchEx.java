package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1: C, 2: C++, 3: Python, 4: Linux");
		
		int subject = scanner.nextInt();
		
		switch(subject) {
		case 1:
			System.out.println("R101");
			break; //	잊지 말자 break
		case 2:
			System.out.println("R202");
			break;
		case 3:
			System.out.println("R303");
			break;
		case 4:
			System.out.println("R404");
			break;
		default:
			System.out.println("관리자에게 문의하세요.");
			break;
				
		}
		
		scanner.close();

	}

}
