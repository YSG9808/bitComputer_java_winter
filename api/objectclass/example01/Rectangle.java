package com.javaex.api.objectclass.example01;

public class Rectangle {
	private int width;
	private int height;
	
	//	생성자 
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj;
			return getArea() == other.width * other.height;
		}
		return super.equals(obj);
	}
	
	
}
