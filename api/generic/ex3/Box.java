package com.javaex.api.generic.ex3;

//	Generic 이용: Generic에 타입 파라미터는 여러 개 사용할 수 있다
//		이 때는 각 타입 파라미터를 콤마로 구분하여 부여한다
public class Box<K, V> {
	K key;
	V content;
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getContent() {
		return content;
	}
	
	public void setContent(V content) {
		this.content = content;
	}

}
