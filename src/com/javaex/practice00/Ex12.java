package com.javaex.practice00;

public class Ex12 {

	public static void main(String[] args) {
		// 삼각형 출력하기 - pattern 1
		for(int iY = 1; iY <= 5; iY++) {
			
			for(int iX = 0; iX < iY; iX++) {
				if( iX == iY - 1) {
					System.out.println("*");
				} else {
					System.out.print("*");
				}
				
			}
		}
		
		
	}

}
