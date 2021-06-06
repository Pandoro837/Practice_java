package com.javaex.practice00;

public class Ex07 {

	public static void main(String[] args) {		
		// while문을 사용하여 0 부터 10 미만의 정수 중에서 홀수만을 큰수부터 출력하시오.

		int i = 0;
		
		while(i < 10) {
			if(i % 2 != 0) {
				System.out.println((10-i));
			}
			i++;
		}
		
	}

}
