package com.javaex.oukie;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자:");
		int iNum01 = sc.nextInt();
//		System.out.print("숫자:");
//		int iNum02 = sc.nextInt();
	
		sc.close();
		
//		for(int i = 0; i < iNum01; i++) {
//			if(i == 0 || i == (iNum01 - 1)) {
//				for(int j = 0; j < iNum02; j++) {
//					if(j == (iNum02 - 1)) {
//						System.out.println("■");
//					} else {
//						System.out.print("■");
//					}
//				}
//			} else { 
//				for(int j = 0; j < iNum02; j++) {
//					if(j == 0 || j == (iNum02 - 1)) {
//						if(j == 0) {
//							System.out.print("■");
//						} else {
//							System.out.println("■");
//						} 
//						} else {
//							System.out.print("□");
//						
//					}
//				}
//				
//			}
//		}
		String[][] sArray = new String[iNum01][iNum01];
		
		for(int i = 0; i < sArray.length; i++) {
			for(int j = 0; j < sArray.length; j++) {
				if(i == 0 || i == iNum01 - 1) {
					sArray[i][j] = "■";
				} else {
					if(j == 0 || j == iNum01 - 1) {
						sArray[i][j] = "■";
					} else {
						sArray[i][j] = "□";
					}
				}
			
			}
		}	
		
		for(int i = 0; i < sArray.length; i++) {
			for(int j = 0; j < sArray.length; j++) {
				System.out.print(sArray[i][j]);
				if(j == sArray.length - 1) {
					System.out.println("");
				}
			}
		}
		
		
			
	

	}

}
