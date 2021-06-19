package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		//삼각형 출력하기 - pattern 3
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int iNum = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < iNum ; i++) {
			for(int iX = iNum; iX - i > 0; iX--) {
				if(iX - i > 1) {
					System.out.print("*");
				} else {
					System.out.println("*");
				}
			}
		}

	}

}
