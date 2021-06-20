package com.javaex.programmers;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요:");
		int x = sc.nextInt();
		sc.close();
		
		int i = 10000;
		int iSum = 0;
		int y = x;
		while(i >= 1) {
			int iQuotient;
			iQuotient = y / i;
			iSum = iSum + iQuotient;
			y  =y - i * iQuotient; 
			i = i / 10;
			
		}
		
		if(x % iSum == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
//		System.out.println(harshad(x));
		
	}
//	
//	public static boolean harshad(int x) {
//		
//		
//		
//	}

}
