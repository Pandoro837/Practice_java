package com.javaex.practice04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 점수를 입력하여 평균을 구해보자
		
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		name[0] = "철수";
		name[1] = "철희";
		name[2] = "영수";
		name[3] = "영희";
		
		int[][] iStudent = new int[4][5];
		int[] iGrade = new int[5];
		
//		배열에 점수 입력
		for(int i = 0; i < iStudent.length; i++) {
				System.out.println(name[i] + "의 점수 입력");
				for(int j = 0; j < 4; j++) {
					iStudent[i][j] = sc.nextInt();
				}
		}
		sc.close();
		
//		개인별 총점을 저장
		for(int i = 0; i < iStudent.length; i++) {
			for(int j = 0; j < 4; j++) {
			iStudent[i][4] = iStudent[i][4] + iStudent[i][j];
			}
		}
		
//		전체의 과목별, 총점을 합산
		for(int i = 0; i < iGrade.length; i++) {
			for(int j = 0; j < iGrade.length - 1; j++) {
				iGrade[i] = iGrade[i] + iStudent[j][i];
			}
		}
		
//		개별 점수와 총점 출력
		for(int i = 0; i < iStudent.length; i++) {
			System.out.print(name[i] + " : ");
			for(int j = 0; j < 5; j ++) {
				if(j == 3) {
					System.out.print(iStudent[i][j]);
				} else if(j == 4) {
					System.out.println(" 개인 총점 : " + iStudent[i][j]);
				} else {
					System.out.print(iStudent[i][j] + ", ");	
				}
			}
			System.out.println("---------------------------------------------");
		}
		
//		과목별 총점과 총합 출력
		System.out.print("과목 : ");
		for(int i = 0; i < iGrade.length; i++) {
			
			if(i == 3) {
				System.out.print(iGrade[i]);
			} else if(i == 4) {
				System.out.println(" 총합 : " + iGrade[i]);
			} else {
				System.out.print(iGrade[i] + ", ");	
			}
		}
	
	}
	
}
