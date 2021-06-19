package com.javaex.oukie;

public class Calculator {

//	생성자
	public Calculator() {
		
	}
	
//	메소드 일반
	public int add(int x, int y) {
		return x + y;
	}
	public int add(int x, int y, int z) {
		return add(add(x, y), z);
	}
	
}
