package com.javaex.practice02;

import java.util.Scanner;

public class Ex03App {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 1:");
		int iNum01 = sc.nextInt();
		System.out.print("숫자 2:");
		int iNum02 = sc.nextInt();
		sc.close();

		Ex03 ex = new Ex03();
		
		ex.solution(iNum01, iNum02);
		
		


	}

}
