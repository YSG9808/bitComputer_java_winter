package com.javaex.practice01;

public class Problem03 {

	public static void main(String[] args) {
		for (int row = 1; row <=9; row++) {
			for (int dan = 2; dan <=9; dan++) {
				System.out.print(dan + "*" + row + "=" + dan * row);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
