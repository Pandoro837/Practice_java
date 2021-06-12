package com.javaex.practice02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		sc.close();
		
		System.out.println(solution(num));

	}

	public static String solution(int num) {
        String answer;
            if(num % 2 == 0){
                answer = "Even";
            } else {
                answer = "Odd";
            }
        return answer;
    }
	
}
