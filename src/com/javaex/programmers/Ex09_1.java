package com.javaex.programmers;

public class Ex09_1 {

	public static void main(String[] args) {
			
		int[] iArray = {10};
		int[] answer = {-1};
		if(iArray.length - 1 != 0) {
			answer = new int[iArray.length-1];
		}
		
		int min = iArray[0];
		int index = 0;
		
		for(int i = 0; i < iArray.length; i++) {
			if(min >= iArray[i]) {
				min = iArray[i];
				index = i;
			}
		}
		
		System.out.println(min);
		System.out.println(index);
		
		for(int i = 0; i < iArray.length; i++) {
			if(index == i) {
				continue;
			} else {
				answer[i] = iArray[i];
			}
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}

}
