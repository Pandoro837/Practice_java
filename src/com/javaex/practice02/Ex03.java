package com.javaex.practice02;

public class Ex03 {

	public int[] solution(int n, int m) {
		int[] iArrayAnswer = new int[2];
		boolean flag = true;
		int i = 1;
		
		while(flag) {
			if(n % i == 0 && m % i == 0) 
			{
				if(iArrayAnswer[0] < i) {
					iArrayAnswer[0] = i;
				}
			} else if(i % n == 0 && i % m == 0) 
			{
				iArrayAnswer[1] = i;
				flag = false;
			}
			i++;
		}
		
		for(int j = 0; j < iArrayAnswer.length; j++) {
			System.out.println(iArrayAnswer[j]);
		}
	
		return iArrayAnswer;
		
	}
	
}
