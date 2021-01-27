package com.javaex.collection.hash;

import java.util.HashSet;

class Student {
	int id;
	String name;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

//	hashCode, equals를 오버라이드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student other = (Student)obj;
			return name == other.name && id == other.id;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return id;
	}
}

public class HashSetEx2 {

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student("홍길동", 10);
		Student s2 = new Student("남승균", 20);
		Student s3 = new Student("남승균", 20);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
		System.out.println(s2.equals(s3));
		
		System.out.println(hs.contains(new Student("남승균", 20)));
	}
}
