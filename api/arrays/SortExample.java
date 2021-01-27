package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//	사용자 정의 클래스를 Sort하고자 할 때는 Comparable 인터페이스를 구현해야 한다
class Member implements Comparable {
	String name;
	
	public Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object other) {
		if (other instanceof Member) {
			return name.compareTo(((Member)other).name);
			//	-1, 0, 1
			//	비교 대상이 동일한 경우 : 0
			//	비교 대상이 작은 경우 : -1
			//	비교 대상이 큰 경우 : 1
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
}

public class SortExample {

	public static void main(String[] args) {
//		basicSortTest();
		//basicSortDescendingTest();
		sortCustomClassTest();
	}
	
	public static void basicSortTest() {
		int[] scores = { 80, 50, 30, 90, 75, 88, 77 };
		System.out.println("배열 원본:" + Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println("기본 정렬:" + Arrays.toString(scores));
	}
	
	public static void basicSortDescendingTest() {
		Integer[] scores = {80, 50, 30, 90, 75, 88, 77};
		System.out.println("배열 원본:" + Arrays.toString(scores));
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println("역순 정렬:" + Arrays.toString(scores));
	}
	
	public static void sortCustomClassTest() {
		Member[] members = {
				new Member("홍길동"),
				new Member("남승균"),
				new Member("장길산")
		}; 
		System.out.println("배열 원본:" + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬:" + Arrays.toString(members));
	}
	
	
}
