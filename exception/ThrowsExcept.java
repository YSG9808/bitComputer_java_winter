package com.javaex.exception;

import java.io.IOException;

//	사용자 정의 예외
class CustomArithmeticException extends ArithmeticException {
	private int num1;
	private int num2;
	
	public CustomArithmeticException(String message, int num1, int num2) {
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}
}

public class ThrowsExcept {
	public void executeException() throws IOException {
		System.out.println("강제 예외 발생");
		throw new IOException("강제 예외");
	}
	
	public void executeRuntimeException() throws RuntimeException {
		System.out.println("런타임 오류");
		throw new RuntimeException("Runtime Exception");
	}
	
	public double divide(int num1, int num2) throws CustomArithmeticException {
		if (num2 == 0) {
			//	구체적인 예외로 전환하여 throw 하는 것이 코드 가독성에 좋다
			//	예외를 변환할 때, 오류 상태의 정보를 함께 전달하면
			//	디버깅시 유리하게 된다
			throw new CustomArithmeticException("사용자 정의 Exception", num1, num2);
		}
		return num1 / num2;
	}
}
