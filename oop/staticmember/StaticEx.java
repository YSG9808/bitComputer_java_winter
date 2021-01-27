package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount;	//	클래스 변수
	public static String classVar;	//	클래스 변수
	public String instanceVar;	//	인스턴스 변수
	
	//	스태틱 블록으로 클래스 변수 초기화
	static {
		refCount = 0;
		classVar = "Static Member";
		System.out.println("Static Block");
//		instanceVar = "Instance Var";	
		//	static 영역에서는 static만 접근 가능
	}
	
	//	생성자
	public StaticEx() {
		refCount++;
		System.out.println("refCount:" + refCount);
		System.out.println("Instance Created");
	}
	
	@Override
	protected void finalize() throws Throwable {
		refCount--;
		super.finalize();
		System.out.println("Finalize Called");
	}
}
