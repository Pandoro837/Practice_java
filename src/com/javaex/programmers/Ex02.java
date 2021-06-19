package com.javaex.programmers;

public class Ex02 {

		public double solution(int[] arr) {
			double answer = 0;
	        long lSum = 0L;
	        for(int i = 0; i < arr.length; i ++) {
	            lSum = lSum + arr[i];
	        }
	        
	        answer = lSum / (double)arr.length;
	        
	        return answer;
		}
		
	}
