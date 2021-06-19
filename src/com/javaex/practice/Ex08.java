package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// for 문을 사용하여 0부터 10미만의 정수의 합을 출력하시오.
		
		int iSum = 0;
		
		for(int i = 0; i < 10; i++) {
			if(i < 10) {
				iSum = iSum + i;
			}
		}
		System.out.println(iSum);
	}

}
