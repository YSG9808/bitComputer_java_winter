package com.javaex.exception;

import java.io.IOException;

//	checked exception: 반드시 예외 처리가 필요한 예외
//	unchecked exception: RuntimeException을 상속한 예외들 
public class ThrowExceptApp {

	public static void main(String[] args) {
		ThrowsExcept except = new ThrowsExcept();
		try {
			except.executeException();
			except.executeRuntimeException();
		} catch (RuntimeException e) {
			System.err.println("Message:" + e.getMessage());
		} catch (IOException e) {
//			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		//	사용자 정의 Exception의 사용
		try {
			except.executeException(); // checked exception
			except.executeRuntimeException(); // unchecked exception
			System.out.println(except.divide(100, 0));
		} catch (IOException e) {
			System.err.println("호출된 메서드에서 checked 예외 발생!");
			e.printStackTrace(); // 예외의 세부 정보 확인
		} catch (CustomArithmeticException e) {
			System.out.println("에러 메시지:" + e.getMessage());
			System.out.println("나누어지는 수:" + e.getNum1());
			System.out.println("나누는 수:" + e.getNum2());
		} catch (RuntimeException e) {
			System.err.println("호출된 메서드에서 checked 예외 발생!");
			e.printStackTrace(); // 예외의 세부 정보 확인
		} catch (Exception e) {
			//	가장 마지막에는 일반 예외로 마무리(권장)
		} finally {
			System.out.println("예외 처리 완료");
		}
	}

}





