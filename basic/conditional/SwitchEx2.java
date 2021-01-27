package com.javaex.basic.conditional;

public class SwitchEx2 {

	public static void main(String[] args) {
		// switch문에서 char 사용
		char grade = 'A';
		String message;
		
		switch (grade) {
		case 'A':
			message = "Excellent!";
			break;
		case 'B':
			message = "Good!";
			break;
		case 'C':
			message = "So so!";
			break;
		case 'D':
			message = "Pass";
			break;
		case 'F':
			message = "Fail";
			break;
		default:
			message = "?";
		}
		
		System.out.println(message);

	}

}
