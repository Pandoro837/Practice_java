package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int iNum = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < iNum; i++) {
			for(int iX = 0; iX < iNum - i; iX++) {
				System.out.print("*");
			}
			for(int iSpace = 0; iSpace < i; iSpace ++) {
				System.out.print("  ");
			}
			for(int iX = 1; iX <= iNum - i; iX++) {
				if(iX == iNum - i) {
					System.out.println("*");
				} else {
					System.out.print("*");
				}
			}
		}
	}

}
