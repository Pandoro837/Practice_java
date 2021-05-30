package com.javeex.parctice;

public class Ex02 {
	
	public static void main(String[] args) {
		//변수 x가 10보다 크고 20보다 작을 때, x를 출력하는 조건식을 완성하라
		
		int iX = (int)(Math.random() * 10 +10);
		int iAnswer = 10;
		
		while(iAnswer <=20) {
			
			if(iAnswer == iX) {
				System.out.println(iAnswer);
				break;
			} else {
				iAnswer++;
			}
			
		}
		
	}
	
}
