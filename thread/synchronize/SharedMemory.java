package com.javaex.thread.synchronize;

public class SharedMemory {
	private int memory;

	public int getMemory() {
		return memory;
	}

//	public void setMemory(int memory) {
	//	임계 영역: 멀티 쓰레드 프로그램에서 단 하나의 쓰레드만 실행할 수 있는 코드 영역
	//	임계 영역 지정을 위해 메서드 선언부에 synchronized 키워드를 부여해야 함
	public synchronized void setMemory(int memory) {
		//	동기화 메서드가 실행되면 객체가 잠금 상태가 되어 다른 쓰레드가 
		//	이 메서드를 호출할 수 없다
		this.memory = memory;
		try {
			Thread.sleep(1000); 	//	쓰레드 일시 정지
		} catch (InterruptedException e) {
		}
		
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	
	
}
