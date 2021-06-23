package com.javaex.programmers;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strA = str.split(",");
		int[] iArray = new int[strA.length];
		for(int i = 0; i < strA.length; i++) {
			iArray[i] = Integer.parseInt(strA[i]);
		}
		sc.close();
		
		for(int i = 0; i < iArray.length; i++) {
			System.out.println(iArray[i]);
		}
		
		for(int i = 0; i < solution(iArray).length; i++) {
			System.out.println(solution(iArray)[i]);
		}
		
	}
	
	public static int[] solution(int[] iArray) {
		int[] answer = {};
		int min = iArray[0];
		int index = 0;
		
		for(int i = 0; i < iArray.length; i++) {
			if(min < iArray[i]) {
				min = iArray[i];
				index = i;
			}
		}
		
		for(int i = 0; i < iArray.length; i++) {
			if(index == i) {
				continue;
			} else {
				answer[i] = iArray[i];
			}
		}
		
		return answer;
	}
	
}
