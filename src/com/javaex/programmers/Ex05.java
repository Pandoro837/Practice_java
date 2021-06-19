package com.javaex.programmers;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
//		입력된 문자열의 뒷자리 4자리를 제외한 나머지를 *로 대체하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력해주세요: ");
		String hp = sc.nextLine();
		sc.close();
		
		System.out.println(Ex05.replaceHp(hp));
		
	}

	public static String replaceHp(String hp) {
//		String replace = new String();
//		for(int i = 0; i < hp.length()-4; i ++) {
//			replace+="*";
//		}
//		return hp.replace(hp.substring(0, hp.length()-4), replace);
		
		String answer = new String();	
		int size = hp.length();
		
		for(int i = 0; i < size - 4; i++) {
			answer = answer + "*";
		}
		
		answer = answer + hp.substring(size-4, size);
		return answer;
		
	}
	
}
