package com.javaex.practice00;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//10에서 20 사이의 정수인 난수 X의 값을 맞추시오
				
		int iX = (int)(Math.random() * 10 +10);
		int iAnswer = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10에서 20 사이의 정수 x를 맞추세요");
		
		while(iAnswer != iX) {
			System.out.print(">> ");
			iAnswer = sc.nextInt();
			if(iAnswer != iX) {
				System.out.println("정답이 아닙니다.");	
			}
		}
		
		System.out.println("정답입니다.");
		
		sc.close();
		
	}
}
