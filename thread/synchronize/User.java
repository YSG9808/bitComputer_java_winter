package com.javaex.thread.synchronize;

public class User extends Thread {
	private SharedMemory memory;
	private int data;
	
	public User(String name, SharedMemory memory, int data) {
		this.setName(name);		//	Thread 이름 정의
		this.memory = memory;
		this.data = data;
	}
	
	public void run() {
		if (memory != null) {
			memory.setMemory(data);
		}
	}
}
