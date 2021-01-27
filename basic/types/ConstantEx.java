package com.javaex.basic.types;

import java.util.Calendar;

public class ConstantEx {
	//	final은 한번 할당되면 재할당이 되지 않는다.
//	static final double PI = 3.14159;	//	상수의 식별자는 모두 대문자로
//	static final int SPEED_LIMIT = 110;	//	단어의 조합은 _로 구분
	
	public static void main(String[] args) {
		final double PI = 3.14159; //	상수의 식별자는 모두 대문자료
		final int SPEED_LIMIT = 110; // 단어의 조합은 _로 구분
		
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		
		int limit = SPEED_LIMIT;
		System.out.println("현재 도로에서 제한속도는 " + limit + "입니다.");
		System.out.println("제한속도 " + limit + "이하로 주행해 주십시오.");
		
		//	상수 변경 시도
//		SPEED_LIMIT = 120;
		//	final이어서 변경은 불가함
		
		//	Java는 내부적으로 상수를 많이 사용하고 있다
		System.out.println(Math.PI);
		System.out.println(Calendar.JANUARY);
		System.out.println(Calendar.SUNDAY);
		
	}
}
