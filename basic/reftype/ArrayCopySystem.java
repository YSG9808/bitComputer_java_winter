package com.javaex.basic.reftype;

public class ArrayCopySystem {

	public static void main(String[] args) {
		int source[] = {1, 2, 3};
		int target[] = new int[10];
		
		System.arraycopy(source,	// 원본 배열 
				0,	//	시작 인덱스 
				target,	//	타겟 배열 
				3,	//	타겟 배열의 인덱스 
				source.length);	//	복사할 길이
		
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + " ");
		}
		System.out.println();
		
		//	Enhanced For
		for (int val:target) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

}
