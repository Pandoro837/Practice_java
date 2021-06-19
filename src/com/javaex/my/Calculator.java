package com.javaex.my;

public class Calculator {
	
	
	public static double result(double dNum01, String sign , double dNum02) {
		double dResult = 0;
		
		switch(sign) {
		case "+":
			dResult = dNum01 + dNum02;
			break;
		case "-":
			dResult = dNum01 - dNum02;
			break;
		case "*":
			dResult = dNum01 * dNum02;
			break;
		case "/":
			dResult = dNum01 / dNum02;
			break;
		}
		
		return dResult; 
	}
	
}
