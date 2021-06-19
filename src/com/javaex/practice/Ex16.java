package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// 역정삼각형 출력하기

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int iNum = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < iNum; i++) {
			for(int iSpace = 0; iSpace < i; iSpace++) {
				System.out.print(" ");
			}
			for(int iX = 1; iX + i <= iNum; iX++) {
				if(iX + i < iNum) {
					System.out.print("**");
				} else {
					System.out.println("*");
				}

				
			}
		}
	}

}
