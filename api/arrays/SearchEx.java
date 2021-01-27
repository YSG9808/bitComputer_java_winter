package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SearchEx {

	public static void main(String[] args) {
		//	Java Array의 sort는 기본적으로 binarySearch 알고리즘을 사용한다
		//	기본형 검색
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		Arrays.sort(nums);	//	binarySearch는 소트를 먼저 해야 한다
		int index = Arrays.binarySearch(nums, 6);
		
		System.out.println("6의 인덱스:" + index);
		
		//	String 검색: 참조타입 검색
		String[] str = { "Java", "C", "C++", "Python", "Linux" };

		Arrays.sort(str);	//	binarySearch는 소트를 먼저 해야 한다
		System.out.println(Arrays.toString(str));
		
		int index2 = Arrays.binarySearch(str, "Linux");
		
		System.out.println("인덱스: " + index2);
		searchCustom();
	}

	public static void searchCustom() {
		Member[] members = {
				new Member("홍길동"),
				new Member("남승균"),
				new Member("장길산")
		}; 
		Arrays.sort(members);

		System.out.println(Arrays.binarySearch(members, new Member("홍길동"), new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {				
				return o1.name.compareTo(o2.name);
			}		
		}));
		
	}
}
