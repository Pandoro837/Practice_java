package com.javaex.programmers;

import java.util.Scanner;

public class Ex08_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		long num = sc.nextInt();
		sc.close();
		
		int iCount = 0;
		
		while(iCount <= 500) {
			if(num == 1) {
				System.out.println(iCount);
				break;
			} else if (iCount == 500) {
				System.out.println(-1);
				break;
			} else {
				if(num % 2 == 0) {
					num/= 2;
					iCount++;
				} else {
					num = (num * 3) + 1;
					iCount++;
				}
			}
		}

	}

}
