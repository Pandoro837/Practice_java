package com.javaex.programmers;

public class Ex10 {

	public static void main(String[] args) {

		System.out.println(solution(144));
		
	}

	public static long solution(long x) {
		long answer = 0;
		long root;
		
		if(Math.sqrt(x) == (long)Math.sqrt(x)) {
			root = (long)Math.sqrt(x) + 1;
		} else {
			return -1;
		}
		
		answer = root * root;
		
		return answer;
	}
}
