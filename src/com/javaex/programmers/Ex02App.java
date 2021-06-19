package com.javaex.programmers;

public class Ex02App {

	public static void main(String[] args) {
		
		Ex02 ex = new Ex02();
		
		int[] arr = new int[4];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println(ex.solution(arr));
		
		
	}

}
