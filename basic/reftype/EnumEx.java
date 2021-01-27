package com.javaex.basic.reftype;

public class EnumEx {

	public static void main(String[] args) {
		Week today = Week.THURSDAY;
		
		System.out.printf("Today is %s(%d)%n",
				today.name(),
				today.ordinal());
		
		//	문자열을가지고 열거 객체 반환
		Week obj = Week.valueOf("FRIDAY");
		System.out.println(obj.name() + " " + obj.ordinal());
	}

}
