package com.javaex.basic.loop;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		int total = 0;
		int value = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("숫자를 입력하세요. [0이면 종료]");
			value = scanner.nextInt();
			total += value;
		} while (value != 0);
		
		System.out.println("총 합:" + total);
		scanner.close();
	}

}
