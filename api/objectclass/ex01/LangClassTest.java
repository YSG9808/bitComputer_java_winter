package com.javaex.api.objectclass.ex01;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		
		//	Java의 최상위 클래스는 Object -> 기본적으로 물려 받는다
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
		
		//	P의 부모 객체를 얻어와 보자
		System.out.println(p.getClass()
				.getSuperclass()
				.getName());
		
	}

}
