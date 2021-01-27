package com.javaex.basic.reftype;

public class EnumEx2 {

	public static void main(String[] args) {
		Week today = Week.THURSDAY;
		String act;
		
		switch(today) {
			case SUNDAY:
				act = "휴식";
				break;
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
				act = "열공";
				break;
			case FRIDAY:
				act = "열공 후 불금";
				break;
			case SATURDAY:
				act = "그냥 잘래";
				break;
			default:
				act = "난 누구?";
				
		}
		
		System.out.println(act);
		

	}

}
