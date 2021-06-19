package com.javaex.programmers;

public class Ex04App {

	public static void main(String[] args) {
		// 행렬의 덧셈, 같은 행, 같은 열의 값을 서로 더해 반환하는 함수를 만드세요.
		
		int[][] arr1 = {{1,2}, {3,4}};
		int[][] arr2 = {{3,4}, {5,6}};
		Ex04 arr = new Ex04();
		
		arr.solution(arr1, arr2);
		
	}

}
