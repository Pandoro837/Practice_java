package com.javaex.programmers;

public class Ex11 {

	public static void main(String[] args) {
		System.out.println(solution(987));
	}

	public static int solution (int n) {
		int answer = 0;
		String str = Integer.toString(n);
		String[] sArr = str.split("");
		int[] iArr = new int[sArr.length];
		for(int i = 0; i < sArr.length; i++) {
			iArr[i] = Integer.parseInt(sArr[i]);
		}
		
		for(int i = 0; i < iArr.length; i++) {
			answer+=iArr[i];
		}
		
		return answer;
	}
	
}
