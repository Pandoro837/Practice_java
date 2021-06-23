package com.javaex.programmers;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = sc.nextInt();
		sc.close();
		
		System.out.println(solution(num));
		
	}
	static int answer = 0;
	
	public static int solution(long num) {
		
		if(num == 1) {
            return answer;    
        } else if(answer == 500) {
        	return -1;
        } else {
            if(num % 2 == 0){
                num = num / 2;
                answer++;
                return solution(num);
            } else {
                num = (num * 3) + 1;
                answer++;
                return solution(num);
            }
        }
		
	}
	
}
