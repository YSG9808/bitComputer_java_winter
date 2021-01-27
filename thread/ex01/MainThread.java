package com.javaex.thread.ex01;

public class MainThread {

	public static void main(String[] args) {
		//	쓰레드를 불러와 실행
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		//	쓰레드의 시작
		thread.start();
		
		//	메인 쓰레드의 코드를 만들겠습니다.
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			
			//	출력 속도 지연
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
