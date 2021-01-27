package com.javaex.oop.point.v4;

public class ColorPoint extends Point {
	private String color;
	
	//	생성자
	public ColorPoint() {
		super();
	}
	
	public ColorPoint(String color) {
		super();
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	//	getters / setters
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void draw() {
		System.out.printf("색깔점[color=%s, x=%d, y=%d]을 그렸습니다.%n", 
				color, x, y);
	}
}
