package com.javaex.practice01;

import java.util.Scanner;

public class BmrApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요: ");
		String name = sc.nextLine();
		System.out.print("나이를 입력해 주세요: ");
		int iAge = sc.nextInt();
		System.out.print("키를 입력해 주세요: ");
		float dHeight = sc.nextFloat();
		System.out.print("체중을 입력해 주세요: ");
		float dWeight = sc.nextFloat();
		sc.close();
		
		Bmr bmr = new Bmr(name, iAge, dHeight, dWeight);
		
		bmr.print();
		
	}

}
