package com.javaex.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		List<String> l = new LinkedList<String>();
		
		//	객체 추가
		l.add("Java");	//	add 맨 뒤에 새 아이템 추가
		l.add("C");
		l.add("C++");
		l.add("Python");
		
		//	객체 중간에 삽입
		l.add(2, "C#");
		System.out.println(l);
		
		//	List는 중복 삽입을 허용
		l.add("Java");
		System.out.println(l);
		System.out.println("size:" + l.size());
//		System.out.println("capacity:" + l.capacity());
//		capacity는 확인할 수 없음
		
		//	객체의 삭제: 인덱스의 삭제
		l.remove(2);
		//	객체의 삭제: 주어진 객체 값으로 삭제
		l.remove("Python");
		System.out.println(l);
		
		//	List, Set 등에서는 Iterator를 사용
		System.out.println("Iterator ======");
		Iterator<String> it = l.iterator();
		while (it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}
		
		//	비워 봅시다
		l.clear();
		System.out.println(l);
	}
}
