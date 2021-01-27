package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
//		stringBasic();
		usefulMethods();
	}
	
	private static void stringBasic() {
		String s1 = "Java";	//	리터럴
		String s2 = new String("Java");	//	메모리에 새로 만들기
		String s3 = "Java";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		//	배열을 활용한 String 생성자	
		char[] letters = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		
		//	valueOf 메서드 -> 기본 타입을 문자열로 리턴
		String s5 = String.valueOf(3.14159f);
	}
	
	private static void usefulMethods() {
		//	유용한 메서드들
		String str = "Java Programming is Fun?";
		
		//	총 문자의 수를 반환
		System.out.println(str.length());
		
		//	변환 메서드
		System.out.println(str.toUpperCase());	//	문자열을 모두 대문자로
		System.out.println(str.toLowerCase());	//	문자열을 모두 소문자로
		
		//	Search 관련
		System.out.println(str.charAt(5)); //	5번 인덱스의 char
		System.out.println(str.indexOf("Fun")); //	문자열 안쪽에서 Fun 문자열이 위치한 인덱스
		System.out.println(str.indexOf("fun"));	//	문자열이 내부에 없으면 -1 반환
		System.out.println(str.lastIndexOf("Fun"));
		//	문자열 추출
		System.out.println("substring:" + str.substring(5));
		System.out.println("substring:" + str.substring(5, 16)); //	인덱스 16 전까지 잘라낸 문자열
		
		//	replace
		System.out.println(str.replace('?', '!'));
		System.out.println(str.replaceAll("Fun", "Funny"));
		
		System.out.println(str);
		
		//	
		String s6 = "             Hello       ";
		String s7 = ", Java";
		
		s6 = s6.trim();	//	Whitespace 날리기
		System.out.println(s6 + s7);
		
		//	문자열 분리 : split();
		String[] split = str.split(" ");
//		System.out.println(split);
		
		for (String data: split) {
			System.out.println(data);
		}
		
		//	문자열의 비교 : Unicode의 비교
		//	같으면 0, 비교 값이 작으면 음수, 비교 값이 크면 양수
		System.out.println("ABC".compareTo("ABD"));
	}
}
