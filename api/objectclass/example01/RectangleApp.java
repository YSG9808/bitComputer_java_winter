package com.javaex.api.objectclass.example01;

import java.util.Arrays;

public class RectangleApp {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(2, 12);
		Rectangle c = new Rectangle(3, 3);
		
		//	a와 b의 면적 비교
		System.out.println(a.equals(b));
		//	a와 c의 면적 비교
		System.out.println(a.equals(c));
		
		String s = "Java Programming";
		System.out.println(s.split(" "));
		System.out.println(Arrays.toString(s.split(" ")));
	}

}
