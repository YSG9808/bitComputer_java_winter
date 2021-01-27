package com.javaex.exception;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		String str = new String("Hello");
		
		str = null;
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("널입니다.");
		}
	}

}
