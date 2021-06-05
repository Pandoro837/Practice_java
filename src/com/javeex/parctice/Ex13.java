package com.javeex.parctice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// 삼각형 출력하기 - pattern 2
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력해주세요 : ");
		int iNum = sc.nextInt();
		sc.close();
		// 삼각형의 높이 값
		for (int i = 0; i < iNum; i++) {
			for (int iSpace = 0; iSpace < i; iSpace++) {
				System.out.print(" ");
			}

			for (int iX = iNum; iX - i >= 0; iX--) {
				if (iX - i > 1) {
					System.out.print("*");
				} else if (iX - i == 0) {
					System.out.println("*");
				}
			}

		}
	}

}
