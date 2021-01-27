package com.javaex.api.arrays;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		//	복사
		//	예전 방법 회고
		char src[] = "Java Programming".toCharArray();
		//	이런 것도 있습니다.
		
		//	System을 이용한 카피
		char target[] = new char[src.length];
		System.arraycopy(src, 0, target, 0, src.length);
		
		System.out.println(target);
		
		//	Arrays.copyOf를 이용한 카피
		target = Arrays.copyOf(src, src.length);
		System.out.println(target);

		//	일부 카피
		target = Arrays.copyOfRange(src, 5, src.length);
		System.out.println(target);
		
	}

}
