package com.javaex.api.generic.ex2;

//	Generic 이용
//	타입 파라미터 : T -> Type

//	많이 사용하는 파라미터 관례
//	T: Type
//	R: Return Type
//	K: Key
//	V: Value
//		-> 어겨도 상관 없으나, 관례는 가능한 지키도록 합시다.
public class Box<T> {
	T content;
	
	public T getContent() {
		return content;
	}
	
	public void setContent(T content) {
		this.content = content;
	}

}
