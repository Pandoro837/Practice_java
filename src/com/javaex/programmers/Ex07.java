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
//		
//		if(x % iSum == 0) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
		
//		System.out.println(harshad(x));
		
//		int iSum = 0;	//하샤드 수의 각 자릿수의 합
//		
//		String str = Integer.toString(x);	//int값을 스트링으로 변환
//		char[] cArray = str.toCharArray();	//해당 값을 자릿수별로 쪼개어 문자형 배열에 저장
//		
//		for(int i = 0; i < cArray.length; i ++) {
//			//자릿수의 합을 배열 내부 문자형의 int 형 변환으로 구함
//			iSum+= Character.getNumericValue(cArray[i]);	
//			}
//		
//		//해당 수를 자릿수의 합으로 나눈 나머지의 값을 확인
//		if(x % iSum == 0) {	
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
	}
}
