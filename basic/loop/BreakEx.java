package com.javaex.basic.loop;

public class BreakEx {

	public static void main(String[] args) {
		//	6과 14로 모두 나누어 떨어지는 수를 구하라
		//	이 경우는 어디까지 루프를 돌려야 할지 판단이 서지 않음
		//	while 문으로 판단하자
		
		int num = 1;
		
		while (true) {
			if (num % 6 == 0 && num % 14 == 0)
				break;
			
			num++;
		}
		
		System.out.println(num);

	}

}
