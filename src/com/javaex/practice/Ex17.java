package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// 다이아몬드 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int iNum = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < iNum; i++) {
			for(int iSpace = 1; iSpace < iNum - i; iSpace++) {
				System.out.print(" ");
			}
			
			for(int iX = 0; iX <= i; iX++) {
				if(iX == i) {
					System.out.println("*");
				} else if (iX < i){
					System.out.print("**");
				}
			}
		}
		for(int i = 1; i < iNum; i++) {
			for(int iSpace = 0; iSpace < i; iSpace ++) {
				System.out.print(" ");
				
			}
			for(int iX = 1; iX <= iNum - i; iX++) {
				if(iX == iNum - i) {
					System.out.println("*");
				} else {
					System.out.print("**");
				}
			}
		}
		
		
	}

}
