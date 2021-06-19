package com.javaex.oukie;

public class ArrayList {
	
	private int[] iArray;
	private int index = 0;
	
	public ArrayList(int size){
		iArray = new int[size];
	}
	
	public void add(int x) {
		//add 를 통해서 해당 칸에 값을 넣기
		iArray[index] = x;
		//단, 해당 칸에 값이 있을 경우 다음 칸에 넣기
		index++;
	}
	
	public void print() {
		//만들어진 배열을 출력
		for(int i = 0; i < iArray.length; i++) {
			System.out.println(iArray[i]);
		}
	}
	
}
