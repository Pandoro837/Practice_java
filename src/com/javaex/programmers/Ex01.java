package com.javaex.programmers;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1: ");
		int x = sc.nextInt();
		System.out.print("숫자2: ");
		int n = sc.nextInt();
		
		int[] iArray = new int[n];
		
		for(int i = 0; i < n; i++) {
			iArray[i] = x + (x * i);
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(iArray[i]);
		}
		
		
		sc.close();
		
	}
	
	
}
