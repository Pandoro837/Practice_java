package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// 정삼각형 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int iNum = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < iNum; i++) 
		{
			for(int iSpace = iNum; iSpace - i > 1; iSpace--) {
				System.out.print(" ");
			}
			for(int iX = 0; iX <= i; iX++) {
				if(iX == i) {
					System.out.println("*");
				} else {
					System.out.print("**");
				}
			}
		}
	}

}
