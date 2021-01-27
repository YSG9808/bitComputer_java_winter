package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithExceptionEx {

	public static void main(String[] args) {
		//	스태너로부터 정수 입력
		//	100을 정수로 나눈다
		double result = 0;
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력하세요:");
		
		//	오류 발생 가능 영역
		/*
		num = scanner.nextInt();
		result = 100 / num;
		*/
		//		오류 발생 가능 영역
		
		try {
			num = scanner.nextInt();
			result = 100 / num;
		} catch (InputMismatchException e) {
			System.out.println("정수로 해주세요");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없어요");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally");
		}
		
		System.out.println(result);
		scanner.close();

	}

}
