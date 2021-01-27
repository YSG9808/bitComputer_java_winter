package com.javaex.thread.ex01;

public class DigitThread extends Thread {

	@Override
	public void run() {
		// 새 쓰레드의 실행 흐름
		for (int i = 0; i < 30; i++) {
//			System.out.println("DigitThread:" + i);
			System.out.printf("%s:%d%n", 
					getName(), i);
			//	쓰레드 지연
			try {
				Thread.sleep(300);	//	0.3초 대기
			} catch (InterruptedException e) {
				
			}
		}
		super.run();
	}

}
