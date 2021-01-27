package com.javaex.thread.synchronize;

public class MainThread {

	public static void main(String[] args) {
		SharedMemory memory = new SharedMemory();
		
		User user1 = new User("철수", memory, 100);
		user1.start();
		
		User user2 = new User("영희", memory, 50);
		user2.start();
	}

}
