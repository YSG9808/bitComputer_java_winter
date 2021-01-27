package com.javaex.oop.shape.v1;

public abstract class Shape {
	//	필드
	protected int x;
	protected int y;
	
	//	생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	추상 메서드 선언
	public abstract void draw();
	public abstract double area();	//	인터페이스에 위임
}
