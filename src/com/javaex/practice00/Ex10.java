package com.javaex.practice00;

public class Ex10 {

	public static void main(String[] args) {
		// 1부터 20 미만의 정수 중에서 2 또는 3의 배수인 수의 총합을 구하시오.
		
		int iSum = 0;
		
		for(int i = 0; i < 20; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				iSum = iSum + i;
			}
		}
		
		System.out.println(iSum);

	}

}
