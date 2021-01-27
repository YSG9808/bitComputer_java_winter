package com.javaex.thread.ex02;

public class MainThread2 {

	public static void main(String[] args) {
		//	쓰레드를 불러와 실행
		Thread thread = new DigitThread();
		//	쓰레드의 시작
		thread.start();
		
		//	메인 쓰레드의 코드를 만들겠습니다.
		/* -> AlphabetThread로 이동
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			
			//	출력 속도 지연
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		*/
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.start();
		
		//	thread와 thread2를 메인 쓰레드의 흐름에 합류
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인쓰레드 종료");
	}

}
