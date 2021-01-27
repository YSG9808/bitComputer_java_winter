package com.javaex.api.utility.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		//	캘린더 불러오기
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
//		custom.set(1972, 5, 24);
		custom.set(2012, 8, 24);
		//	유의할 점: 월은 0부터 시작한다, 즉 여기는 9월 24일을 의미한다
		
		//	캘린더에서 년월일을 받아와 보겠습니다.
		int year = now.get(Calendar.YEAR);	//	연
		int month = now.get(Calendar.MONTH);	//	월
		int date = now.get(Calendar.DATE);	//	일
		
		//	출력해 봅시다
		System.out.printf("오늘은 %d년 %d월 %d일 %n", year, month, date);
		month = now.get(Calendar.MONTH) + 1;
		System.out.printf("오늘은 %d년 %d월 %d일 %n", year, month, date);
		
		//	10년 뒤로 여행해 봅시다
		Calendar future = Calendar.getInstance();
		future.add(Calendar.YEAR, 10);
//		System.out.println(future);
		System.out.printf("future: %d년 %d월 %d일%n", 
				future.get(Calendar.YEAR),
				future.get(Calendar.MONTH) + 1,
				future.get(Calendar.DATE));
		
		//	이 날은 무슨 요일일까?
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println(dow);
		String dowStr;
		
		switch(dow) {
		case Calendar.SUNDAY:
			dowStr = "일요일";
			break;
		case Calendar.MONDAY:
			dowStr = "월요일";
			break;
		case Calendar.TUESDAY:
			dowStr = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dowStr = "수요일";
			break;
		case Calendar.THURSDAY:
			dowStr = "목요일";
			break;
		case Calendar.FRIDAY:
			dowStr = "금요일";
			break;
		case Calendar.SATURDAY:
			dowStr = "토요일";
			break;
		default:
			dowStr = "?";
		}
		
		System.out.println(dowStr);
	}

}
