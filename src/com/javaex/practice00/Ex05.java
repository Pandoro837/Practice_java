package com.javaex.practice00;

public class Ex05 {

	public static void main(String[] args) {		
		// for문을 사용하여 0부터 10미만의 정수 중에서 홀수만을 큰수부터 출력하시오.

		for(int i = 9; i > 0; i--) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		for(int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.println(10 - i);
			}
		}
		
	}

}
