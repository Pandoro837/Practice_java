package com.javaex.programmers;

public class Ex04 {
	
	public int[][] solution(int[][] arr1, int[][] arr2){
	
        int[][] answer = new int[arr1.length][];
      
//        입력되는 행렬의 열의 갯수를 구해주어야 한다
//        answer[i] = 으로 각 행의 열의 값을 지정해줄 수 있으며
//        arr1[i].length는 각 행의 열의 길이 값을 나타낸다

//        각 행의 열 갯수 입력
        for(int i = 0; i < arr1.length; i++) {
        	answer[i] = new int[arr1[i].length];
        }
        
//        각 행의 열의 값을 합산
        for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];	
			}
		}
        
//        합산한 answer 값을 출력
        for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				System.out.println(answer[i][j]);
			}
		}
        
        return answer;
		
	}
	
}
