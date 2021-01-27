package com.javaex.basic.reftype;

public class ArrayEx {

	public static void main(String[] args) {
		//	배열의 선언
		String[] names;	//	Type []
		int scores[];	//	식별자 []
		
		//	초기화
		names = new String[] {
			"김",
			"이",
			"박",
			"정"
		};
		
		//	값 목록이 있다면
		float height[] = {
			175.3f,
			170.2f,
			165.3f,
			188
		};	//	선언과 동시에 할 때만 효과
		
		scores = new int[4];
		
		//	인덱스 접근
		//	0으로 시작
		//	총 길이 -1 까지
		
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
//		scores[4] = 100;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s (%.2f) : score = %d%n", 
					names[i],
					height[i],
					scores[i]);
		}
		
		int[] scores2 = scores;
		System.out.println(scores == scores2); //	같은 주소다
		System.out.println(scores2[0]);
		scores[0] = 100;
		System.out.println(scores2[0]);
		
	}

}
