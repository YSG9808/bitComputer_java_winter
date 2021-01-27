package com.javaex.api.utility.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		//	날짜를 얻어옴: 명시적으로 import
		Date now = new Date();
		String nowStr = now.toString();
		
		System.out.println(nowStr);
		System.out.println(now.toLocaleString());	// deprecated
		
		//	형식에 맞게 출력
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(now));
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(now));
		
		//	SimpleDateFormat의 활용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("SDF: " + sdf.format(now));
	}

}
