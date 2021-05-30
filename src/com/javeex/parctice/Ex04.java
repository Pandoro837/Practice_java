package com.javeex.parctice;

public class Ex04 {

	public static void main(String[] args) {
		// for문을 사용하여 0부터 10미만의 정수 중에서 짝수만을 
		//작은 수부터 문자열로 출력하시오.

		for(int i = 0; i < 10; i++) {
			
			if(i % 2 == 0) {
				String to = Integer.toString(i);
				//String 변수명 = Integer.toString(인티져 변수명)
				//int인 변수를 스트링 변수에 스트링 형태로 집어넣는다
				System.out.print(to);
			} 
		}
		
	}

}
