package com.javaex.practice03;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자와 부호를 입력하세요");
		System.out.print("숫자 1:");
		int iNum01 = sc.nextInt();
		sc.nextLine();
		System.out.print("부호:");
		String sign = sc.nextLine();
		System.out.print("숫자 2:");
		int iNum02 = sc.nextInt();
		sc.close();

		System.out.println(Calculator.result(iNum01, sign, iNum02));
		
				
	}

}
